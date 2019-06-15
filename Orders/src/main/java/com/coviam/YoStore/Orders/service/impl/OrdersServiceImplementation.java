package com.coviam.YoStore.Orders.service.impl;

import com.coviam.YoStore.Orders.repository.OrdersRepository;
import com.coviam.YoStore.Orders.entity.Orders;
import com.coviam.YoStore.Orders.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersServiceImplementation implements OrdersService {

    @Autowired
    OrdersRepository ordersRepository;

    @Override
    public Orders insertOrders(Orders orders) {
        return ordersRepository.insert(orders);
    }

    @Override
    public List<Orders> findByUserId(String userId) {
        List<Orders> orders = this.ordersRepository.findByUserId(userId);
        return orders;
    }

    @Override
    public List<Orders> findAll() {
        List<Orders> orders = this.ordersRepository.findAll();
        return orders;
    }

}
