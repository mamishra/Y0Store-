package com.coviam.YoStore.Merchant.dto;

import com.coviam.YoStore.Merchant.entity.Products;
import java.util.List;

public class MerchantDto {


    private String MerchantID;

    private String category;
    private  int rating;
    private List<Products> products;

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

    public List<Products> getProducts() {
        return products;
    }

    public void setProducts(List<Products> products) {
        this.products = products;
    }

}
