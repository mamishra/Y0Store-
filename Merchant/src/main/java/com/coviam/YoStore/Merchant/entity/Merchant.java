package com.coviam.YoStore.Merchant.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.ArrayList;
import java.util.List;

@Document(collection = Merchant.COLLECTION_NAME)
public class Merchant {
    public static final String COLLECTION_NAME="MERCHANT";

    @Id
    private String merchantID;

    private String category;
    private  int rating;

    private List<Products> products;

    protected Merchant(){
        this.products=new ArrayList<>();
    }
     public Merchant(String merchantID, String category, int rating, List<Products> products )
     {
         this.merchantID = merchantID;
         this.category=category;
         this.rating=rating;
         this.products=products;

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



    public List<Products> getProducts() {
        return products;
    }

}
