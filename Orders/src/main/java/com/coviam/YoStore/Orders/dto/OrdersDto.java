package com.coviam.YoStore.Orders.dto;

import com.coviam.YoStore.Orders.entity.OrderDetails;
import com.coviam.YoStore.Orders.dto.OrderDetailsDto;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdersDto {
    private String orderId;
    private BigDecimal orderPrice;
    private String userId;
    private List<OrderDetailsDto> orderDetails;
    private Date date;

    public OrdersDto() {
        this.orderDetails = new ArrayList<>();
    }

    public OrdersDto(String orderId, BigDecimal orderPrice, String userId, Date date, List<OrderDetailsDto> orderDetails) {
        this.orderId = orderId;
        this.orderPrice = orderPrice;
        this.userId = userId;
        this.date = date;
        this.orderDetails = orderDetails;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public BigDecimal getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(BigDecimal orderPrice) {
        this.orderPrice = orderPrice;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<OrderDetailsDto> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(List<OrderDetailsDto> orderDetails) {
        this.orderDetails = orderDetails;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
