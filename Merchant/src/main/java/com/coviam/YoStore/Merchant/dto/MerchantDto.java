package com.coviam.YoStore.Merchant.dto;

<<<<<<< Updated upstream
public class MerchantDto {
=======
import com.coviam.YoStore.Merchant.entity.Products;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
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

>>>>>>> Stashed changes
}
