package com.coviam.YoStore.Orders.controller;

import com.coviam.YoStore.Orders.dto.OrdersDto;
import com.coviam.YoStore.Orders.entity.Orders;
import com.coviam.YoStore.Orders.repository.OrdersRepository;
import com.coviam.YoStore.Orders.service.OrdersService;
import com.sun.tools.corba.se.idl.constExpr.Or;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrdersController {

    @Autowired
    OrdersService ordersService;

    @RequestMapping(method = RequestMethod.POST, value = "/putOrders")
    public ResponseEntity<?> putOrders(@RequestBody Orders ordersDto)
    {
        Orders orders = new Orders();
        BeanUtils.copyProperties(ordersDto, orders);
        ordersService.insertOrders(orders);
        return new ResponseEntity<Orders>(orders, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/getByUserId/{userId}")
    public ResponseEntity<List<Orders>> getByUserId(@PathVariable ("userId") String userId)
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

    @RequestMapping(method = RequestMethod.GET, value = "/getAll")
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
