package com.coviam.YoStore.EcomProducts.entity;

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
    private List<ProductMerchant> productMerchants;
    private int quantity;
    private String category;
    private String productDetails;
    private String productName;

    public Products() {
        this.productMerchants = new ArrayList<>();
    }

    public Products(String sku, double mrp, String brand, String imgurl, List<ProductMerchant> productMerchants, int quantity, String category, String productDetails, String productName) {
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

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public double getMrp() {
        return mrp;
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

    public List<ProductMerchant> getProductMerchants() {
        return productMerchants;
    }

    public void setProductMerchants(List<ProductMerchant> productMerchants) {
        this.productMerchants = productMerchants;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
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
}
