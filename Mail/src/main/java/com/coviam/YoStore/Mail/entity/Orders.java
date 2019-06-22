package com.coviam.YoStore.Mail.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Orders {


    private String orderId;

    private BigDecimal orderPrice;
    private String userId;
    private List<OrderDetails> orderDetails;
    private String date;

    public Orders() {this.orderDetails = new ArrayList<>();}

    public Orders(String orderId, BigDecimal orderPrice, String userId, String date, List<OrderDetails> orderDetails) {
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<OrderDetails> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(List<OrderDetails> orderDetails) {
        this.orderDetails = orderDetails;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "orderId='" + orderId + '\'' +
                ", orderPrice=" + orderPrice +
                ", userId='" + userId + '\'' +
                ", orderDetails=" + orderDetails +
                ", date=" + date +
                '}';
    }
}
