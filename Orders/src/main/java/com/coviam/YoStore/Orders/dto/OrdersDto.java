package com.coviam.YoStore.Orders.dto;

import com.coviam.YoStore.Orders.entity.OrderDetails;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class OrdersDto {
    private String orderId;
    private BigDecimal orderPrice;
    private String userId;
    private List<OrderDetails> orderDetails;
    private Date date;

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

    public List<OrderDetails> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(List<OrderDetails> orderDetails) {
        this.orderDetails = orderDetails;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
