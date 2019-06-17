package com.coviam.YoStore.EcomMerchants.dto;

import java.util.ArrayList;
import java.util.List;

public class MerchantsDto {
    private String merchantID;
    private String category;
    private int rating;
    private int quantitySold;
    private List<MerchantProductsDto> merchantProducts;

    public MerchantsDto() {this.merchantProducts = new ArrayList<>(); }

    public MerchantsDto(String merchantID, String category, int rating, int quantitySold, List<MerchantProductsDto> merchantProducts) {
        this.merchantID = merchantID;
        this.category = category;
        this.rating = rating;
        this.quantitySold = quantitySold;
        this.merchantProducts = merchantProducts;
    }

    public String getMerchantID() {
        return merchantID;
    }

    public void setMerchantID(String merchantID) {
        this.merchantID = merchantID;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getQuantitySold() {
        return quantitySold;
    }

    public void setQuantitySold(int quantitySold) {
        this.quantitySold = quantitySold;
    }

    public List<MerchantProductsDto> getMerchantProducts() {
        return merchantProducts;
    }

    public void setMerchantProducts(List<MerchantProductsDto> merchantProducts) {
        this.merchantProducts = merchantProducts;
    }

    @Override
    public String toString() {
        return "MerchantsDto{" +
                "merchantID='" + merchantID + '\'' +
                ", category='" + category + '\'' +
                ", rating=" + rating +
                ", quantitySold=" + quantitySold +
                ", merchantProducts=" + merchantProducts +
                '}';
    }
}
