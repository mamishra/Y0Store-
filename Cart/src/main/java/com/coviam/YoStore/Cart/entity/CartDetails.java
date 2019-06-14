package com.coviam.YoStore.Cart.entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class CartDetails {

    private String SKU;
    private int quantity;

    public CartDetails(String SKU, int quantity) {
        this.SKU = SKU;
        this.quantity = quantity;
    }

    public String getSKU() {
        return SKU;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setSKU(String SKU) {

        this.SKU = SKU;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "CartDetailsDto{" +
                "SKU='" + SKU + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
