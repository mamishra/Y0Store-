package com.coviam.YoStore.Merchant.dto;

import com.coviam.YoStore.Merchant.dto.MerchantProductsDto;

import java.util.ArrayList;
import java.util.List;

public class MerchantsDto {


    private String merchantID;
    private String category;
    private int rating;
    private int quantitySold;
    private List<MerchantProductsDto> merchantProducts;

    public MerchantsDto() {this.merchantProducts = new ArrayList<>();}

    public MerchantsDto(String merchantID, String category, int rating, int quantitySold, List<MerchantProductsDto> merchantProductsDto) {
        this.merchantID = merchantID;
        this.category = category;
        this.rating = rating;
        this.quantitySold = quantitySold;
        this.merchantProducts = merchantProductsDto;
    }

    public int getQuantitySold() {
        return quantitySold;
    }

    public void setQuantitySold(int quantitySold) {
        this.quantitySold = quantitySold;
    }

    public String getMerchantID() {
        return merchantID;
    }

    public void setMerchantID(String merchantID) {
        merchantID = merchantID;
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

    public List<MerchantProductsDto> getMerchantProductsDto() {
        return merchantProducts;
    }

    public void setMerchantProductsDto(List<MerchantProductsDto> merchantProductsDto) {
        this.merchantProducts = merchantProductsDto;
    }
}
