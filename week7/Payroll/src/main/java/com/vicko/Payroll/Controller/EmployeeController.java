package com.vicko.Payroll.Controller;

import com.vicko.Payroll.Exceptions.EmployeeNotFoundException;
import com.vicko.Payroll.Models.Employee;
import com.vicko.Payroll.Repositories.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.hibernate.EntityMode;
import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@AllArgsConstructor
@RestController
public class EmployeeController {

    private final EmployeeRepository employeeRepository;

    @GetMapping("/employees")
    List<Employee> getAllEmployee(){
        return employeeRepository.findAll();
    }

    @PostMapping("/employees")
    Employee newEmployee(@RequestBody Employee newEmployee){
        return employeeRepository.save(newEmployee);
    }

    @GetMapping("/employees/{id}")
    EntityModel<Employee> getOneEmployee(@PathVariable Long id){
        Employee employee = employeeRepository.findById(id)
                .orElseThrow(() -> new EmployeeNotFoundException(id));

        return EntityModel.of(employee, linkTo(methodOn(EmployeeController.class).getOneEmployee(id)).withSelfRel(),
                linkTo(methodOn(EmployeeController.class).getAllEmployee()).withRel("employees"));

    }

    @PutMapping("/employees/{id}")
    Employee updateEmployee(@RequestBody Employee updateEmployee, @PathVariable Long id){
        return employeeRepository.findById(id)
                .map(employee -> {
                    employee.setName(updateEmployee.getName());
                    employee.setRole(updateEmployee.getRole());
                    return employeeRepository.save(employee);
                }).orElseGet(() ->
                {   updateEmployee.setId(id);
                    return employeeRepository.save(updateEmployee);
                });
    }

    @DeleteMapping("/employees/{id}")
    void deleteEmployee(@PathVariable Long id){
        employeeRepository.deleteById(id);
    }


}
