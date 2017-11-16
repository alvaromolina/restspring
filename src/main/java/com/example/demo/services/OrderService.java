package com.example.demo.services;

import com.example.demo.entities.Order;

public interface OrderService {
    Iterable<Order> listAllOrders();

    Order getOrderById(Long id);

    Order saveOrder(Order order);

    void deleteOrder(Long id);

    Order getOrderByLatitude(Double latitude);

}
