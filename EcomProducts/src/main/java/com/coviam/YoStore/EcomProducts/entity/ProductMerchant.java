package com.coviam.YoStore.EcomProducts.entity;

public class ProductMerchant {

    private String merchantId;
    private int quantity;

    public ProductMerchant() {
    }

    public ProductMerchant(String merchantId, int quantity) {
        this.merchantId = merchantId;
        this.quantity = quantity;
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
