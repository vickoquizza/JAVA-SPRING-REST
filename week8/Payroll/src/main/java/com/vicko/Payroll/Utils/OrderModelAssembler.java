package com.vicko.Payroll.Utils;

import com.vicko.Payroll.Controller.OrderController;
import com.vicko.Payroll.Models.Order;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@Component
public class OrderModelAssembler implements RepresentationModelAssembler<Order, EntityModel<Order>> {
    @Override
    public EntityModel<Order> toModel(Order entity) {
        EntityModel<Order> orderResource =  EntityModel.of(entity,
                linkTo(methodOn(OrderController.class).oneOrder(entity.getId())).withSelfRel(),
                linkTo(methodOn(OrderController.class).getOrders()).withRel("orders"));

        if(entity.getStatus() == Status.IN_PROGRESS){
            orderResource.add(linkTo(methodOn(OrderController.class).cancel(entity.getId())).withRel("cancel"));
            orderResource.add(linkTo(methodOn(OrderController.class).complete(entity.getId())).withRel("complete"));
        }
        return orderResource;
    }
}
