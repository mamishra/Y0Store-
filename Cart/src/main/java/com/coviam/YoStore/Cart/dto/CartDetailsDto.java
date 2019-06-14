package com.coviam.YoStore.Cart.dto;

public class CartDetailsDto {

    private String SKU;
    private int quantity;

    public CartDetailsDto(String SKU, int quantity) {
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
