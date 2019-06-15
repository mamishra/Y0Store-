package com.coviam.YoStore.Orders.controller;

import com.coviam.YoStore.Orders.dto.OrdersDto;
import com.coviam.YoStore.Orders.entity.Orders;
import com.coviam.YoStore.Orders.service.OrdersService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrdersController {

    @Autowired
    OrdersService ordersService;

    @RequestMapping(method = RequestMethod.POST, value = "/putOrders")
    public ResponseEntity<?> putOrders(@RequestBody OrdersDto ordersDto)
    {
        Orders orders = new Orders();
        BeanUtils.copyProperties(ordersDto, orders);
        ordersService.insertOrders(orders);
        return new ResponseEntity<Orders>(orders, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/getOrdersByUserId/{userId}")
    public ResponseEntity<List<Orders>> getOrdersByUserId(@PathVariable ("userId") String userId)
    {
        List<Orders> orders = ordersService.findByUserId(userId);
        OrdersDto ordersDto=new OrdersDto();
        if(orders==null)
        {
            return null;
        }
        BeanUtils.copyProperties(orders,ordersDto);
        return new ResponseEntity<List<Orders>>(orders, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/getAllOrders")
    public ResponseEntity<List<Orders>> getAll()
    {
        List<Orders> orders=ordersService.findAll();
        OrdersDto ordersDto=new OrdersDto();
        if(orders==null)
        {
            return null;
        }
        //BeanUtils.copyProperties(orders,ordersDto);
        return new ResponseEntity<List<Orders>>(orders, HttpStatus.OK);

    }


}
