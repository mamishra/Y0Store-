package com.coviam.YoStore.Product.entity;

public class ProductMerchants {
    private String merchantId;
    private int quantity;

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

    public ProductMerchants() {
    }

    public ProductMerchants(String merchantId, int quantity) {
        this.merchantId = merchantId;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "ProductMerchants{" +
                "merchantId='" + merchantId + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
