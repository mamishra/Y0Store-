package com.coviam.YoStore.Cart.dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public class UserCartDto {


    private long cartId;
    private BigDecimal cartPrice;
    private List<CartDetailsDto> details;

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

    public List<CartDetailsDto> getDetails() {
        return details;
    }

    public void setDetails(List<CartDetailsDto> details) {
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

    public UserCartDto() {
        this.details = new ArrayList<>();
    }

    public UserCartDto(BigDecimal cartPrice, List<CartDetailsDto> details) {
        this.cartPrice = cartPrice;
        this.details = details;
    }
}
