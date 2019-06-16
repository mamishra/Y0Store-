package com.coviam.YoStore.Cart.dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public class UserCartDto {


    private String cartId;
    private BigDecimal cartPrice;
    private List<CartDetailsDto> details;
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

    public List<CartDetailsDto> getDetails() {
        return details;
    }

    public void setDetails(List<CartDetailsDto> details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "UserCartDto{" +
                "cartId='" + cartId + '\'' +
                ", cartPrice=" + cartPrice +
                ", details=" + details +
                ", userId='" + userId + '\'' +
                '}';
    }

    public UserCartDto() {
        this.details = new ArrayList<>();
    }

    public UserCartDto(String cartId, BigDecimal cartPrice, List<CartDetailsDto> details, String userId) {
        this.cartId = cartId;
        this.cartPrice = cartPrice;
        this.details = details;
        this.userId = userId;
    }
}
