package com.vicko.Payroll.Utils;

import com.vicko.Payroll.Controller.EmployeeController;
import com.vicko.Payroll.Models.Employee;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@Component
public class EntityModelAssembler implements RepresentationModelAssembler<Employee, EntityModel<Employee>> {

    @Override
    public EntityModel<Employee> toModel(Employee entity) {
        return EntityModel.of(entity, linkTo(methodOn(EmployeeController.class).getOneEmployee(entity.getId())).withSelfRel(),
                linkTo(methodOn(EmployeeController.class).getAllEmployee()).withRel("employees"));
    }
}
