package com.example.homework23.service;

import com.example.homework23.model.Basket;
import com.example.homework23.model.Order;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class OrderServiceImpl implements OrderService{

    private final Basket basket;

    public OrderServiceImpl(Basket basket) {
        this.basket = basket;
    }

    @Override
    public Collection<Order> getItem() {
        return basket.getOrders();
    }

    @Override
    public Order addItem(int id) {
        Order order = new Order(id);
        basket.getOrders().add(order);
        return order;
    }
}
