package com.example.homework23.service;

import com.example.homework23.model.Order;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Scope("session")
@Service
public class OrderServiceImpl implements OrderService{

    private final Set<Order> orders = new HashSet<>();

    @Override
    public Collection<Order> getItem() {
        return orders;
    }

    @Override
    public Order addItem(int id) {
        Order order = new Order(id);
        orders.add(order);
        return order;
    }
}
