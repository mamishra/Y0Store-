package com.coviam.YoStore.Orders.entity;

public class OrderDetails {
    private String productSKU;
    private String merchantId;
    private int quantity;

    public OrderDetails() {}

    public OrderDetails(String productSKU, String merchantId, int quantity) {
        this.productSKU = productSKU;
        this.merchantId = merchantId;
        this.quantity = quantity;
    }

    public String getProductSKU() {
        return productSKU;
    }

    public void setProductSKU(String productSKU) {
        this.productSKU = productSKU;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
