package com.coviam.YoStore.Product.entity;

import java.util.List;

public class Products {
    private String sku;
    private double mrp;
    private String brand;
    private String imgurl;
    private List<ProductMerchants> merchants;
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
        return merchants;
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

    public void setMerchants(List<ProductMerchants> merchants) {
        this.merchants = merchants;
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
