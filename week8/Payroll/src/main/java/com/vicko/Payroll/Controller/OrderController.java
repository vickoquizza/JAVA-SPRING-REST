package com.vicko.Payroll.Controller;

import com.vicko.Payroll.Exceptions.OrderNotFoundException;
import com.vicko.Payroll.Models.Order;
import com.vicko.Payroll.Repositories.OrderRepository;
import com.vicko.Payroll.Utils.OrderModelAssembler;
import com.vicko.Payroll.Utils.Status;
import lombok.AllArgsConstructor;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.MediaTypes;
import org.springframework.hateoas.mediatype.problem.Problem;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@AllArgsConstructor
@RestController
public class OrderController {

    private final OrderRepository repository;
    private final OrderModelAssembler assembler;

    @GetMapping("/orders")
    public CollectionModel<EntityModel<Order>> getOrders() {

        List<EntityModel<Order>> resources = repository.findAll().stream()
                .map(assembler::toModel)
                .toList();

        return CollectionModel.of(resources, linkTo(methodOn(OrderController.class).getOrders()).withSelfRel());
    }

    @GetMapping("/orders/{id}")
    public EntityModel<Order> oneOrder(@PathVariable Long id) {
        Order order = repository.findById(id).orElseThrow(() -> new OrderNotFoundException(id));

        return assembler.toModel(repository.save(order));
    }

    @PostMapping("/orders")
    ResponseEntity<EntityModel<Order>> createOrder(@RequestBody Order order) {

        order.setStatus(Status.IN_PROGRESS);
        Order newOrder = repository.save(order);

        return ResponseEntity
                .created(linkTo(methodOn(OrderController.class).oneOrder(newOrder.getId())).toUri())
                .body(assembler.toModel(newOrder));
    }


    @DeleteMapping("/orders/{id}/cancel")
    public ResponseEntity<?> cancel(@PathVariable Long id){

        Order orderToCancel = repository.findById(id).orElseThrow(() -> new OrderNotFoundException(id));

        if(orderToCancel.getStatus() == Status.IN_PROGRESS){
            orderToCancel.setStatus(Status.CANCELLED);
            return ResponseEntity.ok(assembler.toModel(repository.save(orderToCancel)));
        }

        return ResponseEntity
                .status(HttpStatus.METHOD_NOT_ALLOWED)
                .header(HttpHeaders.CONTENT_TYPE, MediaTypes.HTTP_PROBLEM_DETAILS_JSON_VALUE)
                .body(Problem.create()
                        .withTitle("Method not allowed")
                        .withDetail("You can't cancel an order that is in the " + orderToCancel.getStatus() + " status"));
    }

    @PutMapping("/orders/{id}/complete")
    public ResponseEntity<?> complete(@PathVariable Long id){

        Order orderToComplete = repository.findById(id).orElseThrow(() -> new OrderNotFoundException(id));

        if(orderToComplete.getStatus() == Status.IN_PROGRESS){
            orderToComplete.setStatus(Status.COMPLETED);
            return ResponseEntity.ok(assembler.toModel(repository.save(orderToComplete)));
        }

        return ResponseEntity //
                .status(HttpStatus.METHOD_NOT_ALLOWED) //
                .header(HttpHeaders.CONTENT_TYPE, MediaTypes.HTTP_PROBLEM_DETAILS_JSON_VALUE) //
                .body(Problem.create() //
                        .withTitle("Method not allowed") //
                        .withDetail("You can't complete an order that is in the " + orderToComplete.getStatus() + " status"));

    }
}
