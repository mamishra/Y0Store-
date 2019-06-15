package com.coviam.YoStore.Merchant.dto;

import com.coviam.YoStore.Merchant.entity.MerchantProducts;
import java.util.List;

public class MerchantsDto {


    private String MerchantID;

    private String category;
    private  int rating;
    private List<MerchantProducts> merchantProducts;

    public String getMerchantID() {
        return MerchantID;
    }

    public void setMerchantID(String merchantID) {
        MerchantID = merchantID;
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

    public List<MerchantProducts> getProducts() {
        return merchantProducts;
    }

    public void setProducts(List<MerchantProducts> products) {
        this.merchantProducts = products;
    }

}
