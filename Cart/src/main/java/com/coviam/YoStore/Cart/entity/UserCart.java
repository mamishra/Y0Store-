package com.coviam.YoStore.Cart.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Document
public class UserCart {

    @Id
    private long cartId;
    private BigDecimal cartPrice;
    private List<CartDetails> details;

    public long getCartId() {
        return cartId;
    }

    public void setCartId(long cartId) {
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
        return "UserCartDto{" +
                "cartId=" + cartId +
                ", cartPrice=" + cartPrice +
                ", details=" + details +
                '}';
    }

    public UserCart() {
        this.details = new ArrayList<>();
    }

    public UserCart(BigDecimal cartPrice, List<CartDetails> details) {
        this.cartPrice = cartPrice;
        this.details = details;
    }
}
