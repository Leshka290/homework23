package com.example.homework23.controller;

import com.example.homework23.model.Order;
import com.example.homework23.service.OrderService;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RequestMapping("/order")
@RestController
@Scope("session")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/add")
    public Order addItem(@RequestParam int id) {
        return orderService.addItem(id);
    }

    @GetMapping("/get")
    public Collection<Order> getItem() {
        return orderService.getItem();
    }
}
