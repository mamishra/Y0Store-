package com.coviam.YoStore.Product.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.ArrayList;
import java.util.List;

@Document
public class Products {
    @Id
    private String sku;

    @Field
    private double mrp;
    private String brand;
    private String imgurl;
    private List<ProductMerchants> productMerchants;
    private int quantity;
    private String category;
    private String  productDetails;
    private String productName;

    public String getsku() {
        return sku;
    }

    public void setsku(String sku) {
        this.sku = sku;
    }

    public double getMrp() {
        return mrp;
    }

    public List<ProductMerchants> getMerchants() {
        return productMerchants;
    }

    public void setMrp(double mrp) {
        this.mrp = mrp;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setMerchants(List<ProductMerchants> productMerchants) {
        this.productMerchants = productMerchants;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getProductDetails() {
        return productDetails;
    }

    public void setProductDetails(String productDetails) {
        this.productDetails = productDetails;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Products() {
        this.productMerchants = new ArrayList<>();
    }

    public Products(String sku, double mrp, String brand, String imgurl, List<ProductMerchants> productMerchants, int quantity, String category, String productDetails, String productName) {
        this.sku = sku;
        this.mrp = mrp;
        this.brand = brand;
        this.imgurl = imgurl;
        this.productMerchants = productMerchants;
        this.quantity = quantity;
        this.category = category;
        this.productDetails = productDetails;
        this.productName = productName;
    }

    @Override
    public String toString() {
        return "Products{" +
                "sku='" + sku + '\'' +
                ", mrp=" + mrp +
                ", brand='" + brand + '\'' +
                ", imgurl='" + imgurl + '\'' +
                ", productMerchants=" + productMerchants +
                ", quantity=" + quantity +
                ", category='" + category + '\'' +
                ", productDetails='" + productDetails + '\'' +
                ", productName='" + productName + '\'' +
                '}';
    }
}
