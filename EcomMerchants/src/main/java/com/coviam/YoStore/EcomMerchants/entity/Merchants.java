package com.coviam.YoStore.EcomMerchants.entity;

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
    private int quantitySold;
    private List<MerchantProducts> merchantProducts;

    public Merchants() {this.merchantProducts = new ArrayList<>(); }

    public Merchants(String merchantID, String category, int rating, int quantitySold, List<MerchantProducts> merchantProducts) {
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

    public List<MerchantProducts> getMerchantProducts() {
        return merchantProducts;
    }

    public void setMerchantProducts(List<MerchantProducts> merchantProducts) {
        this.merchantProducts = merchantProducts;
    }

    @Override
    public String toString() {
        return "Merchants{" +
                "merchantID='" + merchantID + '\'' +
                ", category='" + category + '\'' +
                ", rating=" + rating +
                ", quantitySold=" + quantitySold +
                ", merchantProducts=" + merchantProducts +
                '}';
    }
}
