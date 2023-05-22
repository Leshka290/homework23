package com.example.homework23.service;

import com.example.homework23.model.Order;

import java.util.Collection;

public interface OrderService {

    Collection<Order> getItem();
    Order addItem(int id);
}
