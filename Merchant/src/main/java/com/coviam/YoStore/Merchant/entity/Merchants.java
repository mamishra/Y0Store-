package com.coviam.YoStore.Merchant.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.ArrayList;
import java.util.List;

@Document(collection = Merchants.COLLECTION_NAME)
public class Merchants {
    public static final String COLLECTION_NAME="Merchants";

    @Id
    private String merchantID;
    @Field
    private String category;
    private int rating;
    private List<MerchantProducts> merchantProducts;

    public Merchants(){
        this.merchantProducts=new ArrayList<>();
    }

    public Merchants(String merchantID, String category, int rating, List<MerchantProducts> products )
     {
         this.merchantID = merchantID;
         this.category=category;
         this.rating=rating;
         this.merchantProducts=products;

     }

    public String getCategory() {
        return category;
    }


    public String getMerchantID() {
        return merchantID;
    }

    public int getRating() {
        return rating;
    }



    public List<MerchantProducts> getProducts() {
        return merchantProducts;
    }

    public void setMerchantID(String merchantID) {
        this.merchantID = merchantID;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setMerchantProducts(List<MerchantProducts> merchantProducts) {
        this.merchantProducts = merchantProducts;
    }
}
