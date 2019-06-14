package com.coviam.YoStore.Orders.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Document
public class Orders {

    @Id
    private long orderId;

    private BigDecimal price;
    private long userId;


    
}
