package com.vicko.Payroll.Controller;

import com.vicko.Payroll.Exceptions.EmployeeNotFoundException;
import com.vicko.Payroll.Models.Employee;
import com.vicko.Payroll.Repositories.EmployeeRepository;
import com.vicko.Payroll.Utils.EntityModelAssembler;
import lombok.AllArgsConstructor;
import net.bytebuddy.asm.Advice;
import org.hibernate.EntityMode;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.IanaLinkRelations;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@AllArgsConstructor
@RestController
public class EmployeeController {

    private final EmployeeRepository employeeRepository;
    private final EntityModelAssembler assembler;

    @GetMapping("/employees")
    public CollectionModel<EntityModel<Employee>> getAllEmployee(){

        List<EntityModel<Employee>> employeeResources = employeeRepository.findAll().stream()
                .map(assembler::toModel)
                .collect(Collectors.toList());

        return CollectionModel.of(employeeResources, linkTo(methodOn(EmployeeController.class).getAllEmployee()).withSelfRel());
    }

    @PostMapping("/employees")
    ResponseEntity<?> newEmployee(@RequestBody Employee newEmployee){
        EntityModel<Employee> entityModel = assembler.toModel(employeeRepository.save(newEmployee));

        return ResponseEntity
                .created(entityModel.getRequiredLink(IanaLinkRelations.SELF).toUri())
                .body(entityModel);
    }

    @GetMapping("/employees/{id}")
    public EntityModel<Employee> getOneEmployee(@PathVariable Long id){
        Employee employee = employeeRepository.findById(id)
                .orElseThrow(() -> new EmployeeNotFoundException(id));

        return assembler.toModel(employee);

    }

    @PutMapping("/employees/{id}")
    ResponseEntity<?> updateEmployee(@RequestBody Employee updateEmployee, @PathVariable Long id){
        Employee toUpdate = employeeRepository.findById(id)
                .map(employee -> {
                    employee.setName(updateEmployee.getName());
                    employee.setRole(updateEmployee.getRole());
                    return employeeRepository.save(employee);
                }).orElseGet(() ->
                {   updateEmployee.setId(id);
                    return employeeRepository.save(updateEmployee);
                });

        EntityModel<Employee> updateResource = assembler.toModel(toUpdate);

        return ResponseEntity
                .created(updateResource.getRequiredLink(IanaLinkRelations.SELF).toUri())
                .body(updateResource);


    }

    @DeleteMapping("/employees/{id}")
    ResponseEntity<?> deleteEmployee(@PathVariable Long id){
        employeeRepository.deleteById(id);

        return ResponseEntity.noContent().build();
    }


}
