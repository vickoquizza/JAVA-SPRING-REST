package com.vicko.topic8.Services;

import com.vicko.topic8.DTO.OrderDTO;
import com.vicko.topic8.Exceptions.BookNotFoundException;
import com.vicko.topic8.Models.Book;
import com.vicko.topic8.Models.Order;
import com.vicko.topic8.Repositories.BookRepository;
import com.vicko.topic8.Repositories.OrderRepository;
import com.vicko.topic8.Utils.OrderStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private BookRepository bookRepository;

    public OrderDTO saveOrder(OrderDTO order){
        Book bookToSave =  bookRepository.findById(order.getBookId()).orElseThrow(BookNotFoundException::new);

        Order orderToSave = new Order(order.getId(),
                bookToSave,
                order.getQuantity(),
                order.getShipDate(),
                order.getStatus(),
                order.isComplete());

        orderRepository.save(orderToSave);

        return order;
    }

    public Map<String, Integer> getInventory(){

        Map<String, Integer> OrderByStatus = new HashMap<String, Integer>();

        OrderByStatus.put("placed", orderRepository.findAll().stream().filter(order -> order.getStatus().equals(OrderStatus.placed)).toList().size());
        OrderByStatus.put("delivered", orderRepository.findAll().stream().filter(order -> order.getStatus().equals(OrderStatus.delivered)).toList().size());
        OrderByStatus.put("approved", orderRepository.findAll().stream().filter(order -> order.getStatus().equals(OrderStatus.approved)).toList().size());

        return OrderByStatus;
    }
}
