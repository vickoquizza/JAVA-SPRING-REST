package com.vicko.topic8.Controller;

import com.vicko.topic8.DTO.OrderDTO;
import com.vicko.topic8.Models.Order;
import com.vicko.topic8.Services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class OrderController {

    @Autowired
    private OrderService service;

    @PostMapping("/store/order")
    public OrderDTO saveOrder(@RequestBody OrderDTO order){
        return service.saveOrder(order);
    }

    @GetMapping("/store/inventory")
    public Map<String, Integer> getInventoryOrder(){
        return service.getInventory();
    }
}
