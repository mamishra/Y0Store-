package com.coviam.YoStore.Orders.service;

import com.coviam.YoStore.Orders.entity.Orders;

import java.util.List;

public interface OrdersService {
    Orders insertOrders(Orders orders);
    List<Orders> findByUserId(String userId);
    List<Orders> findAll();
}
