package com.coviam.YoStore.Cart.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Document
public class UserCart {

    @Id
    private String cartId;

    @Field
    private BigDecimal cartPrice;
    private List<CartDetails> details;
    private String userId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCartId() {
        return cartId;
    }

    public void setCartId(String cartId) {
        this.cartId = cartId;
    }

    public BigDecimal getCartPrice() {
        return cartPrice;
    }

    public void setCartPrice(BigDecimal cartPrice) {
        this.cartPrice = cartPrice;
    }

    public List<CartDetails> getDetails() {
        return details;
    }

    public void setDetails(List<CartDetails> details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "UserCart{" +
                "cartId='" + cartId + '\'' +
                ", cartPrice=" + cartPrice +
                ", details=" + details +
                ", userId='" + userId + '\'' +
                '}';
    }

    public UserCart() {
        this.details = new ArrayList<>();
    }

    public UserCart(String cartId, BigDecimal cartPrice, List<CartDetails> details, String userId) {
        this.cartId = cartId;
        this.cartPrice = cartPrice;
        this.details = details;
        this.userId = userId;
    }
}
