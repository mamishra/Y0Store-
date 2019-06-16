package com.coviam.YoStore.Cart.dto;

public class CartDetailsDto {

    private String sku;
    private int quantity;
    private String merchantId;

    public CartDetailsDto() {
    }

    public CartDetailsDto(String sku, int quantity, String merchantId) {
        this.sku = sku;
        this.quantity = quantity;
        this.merchantId = merchantId;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getsku() {
        return sku;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setsku(String sku) {

        this.sku = sku;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    @Override
    public String toString() {
        return "CartDetailsDto{" +
                "sku='" + sku + '\'' +
                ", quantity=" + quantity +
                ", merchantId='" + merchantId + '\'' +
                '}';
    }
}
