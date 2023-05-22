package com.example.homework23.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.Collection;
import java.util.Set;

@Component
@SessionScope
public class Basket {

    private final Set<Order> orders;

    public Basket(Set<Order> orders) {
        this.orders = orders;
    }

    public Collection<Order> getOrders() {
        return orders;
    }
}
