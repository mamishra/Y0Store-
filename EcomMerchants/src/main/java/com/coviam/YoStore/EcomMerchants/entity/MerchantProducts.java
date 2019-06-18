package com.coviam.YoStore.EcomMerchants.entity;

public class MerchantProducts {

    private String productId;
    private int discount;
    private int quantity;
    private String offer;

    public MerchantProducts() {}

    public MerchantProducts(String productId, int discount, int quantity, String offer) {
        this.productId = productId;
        this.discount = discount;
        this.quantity = quantity;
        this.offer = offer;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getOffer() {
        return offer;
    }

    public void setOffer(String offer) {
        this.offer = offer;
    }

    @Override
    public String toString() {
        return "MerchantProducts{" +
                "productId='" + productId + '\'' +
                ", discount=" + discount +
                ", quantity=" + quantity +
                ", offer='" + offer + '\'' +
                '}';
    }
}
