package com.coviam.YoStore.Product.dto;

public class ProductMerchantsDto {
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

    public ProductMerchantsDto() {
    }

    public ProductMerchantsDto(String merchantId, int quantity) {
        this.merchantId = merchantId;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "ProductMerchantsDto{" +
                "merchantId='" + merchantId + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
