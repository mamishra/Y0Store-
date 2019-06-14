package com.coviam.YoStore.Cart.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Document
public class cart {

    @Id
    private long cartId;
    private BigDecimal price;
    private long userId;

}
