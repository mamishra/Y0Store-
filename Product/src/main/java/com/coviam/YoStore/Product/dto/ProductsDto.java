package com.coviam.YoStore.Product.dto;

import com.coviam.YoStore.Product.entity.ProductMerchants;

import java.util.List;

public class ProductsDto {

    private String sku;
    private double mrp;
    private String brand;
    private String imgurl;
    private List<ProductMerchants>  productMerchants;
    private int quantity;
    private String category;
    private String  productDetails;
    private String productName;

    public String getProductDetails() {
        return productDetails;
    }

    public void setProductDetails(String productDetails) {
        this.productDetails = productDetails;
    }

    public List<ProductMerchants> getProductMerchants() {
        return productMerchants;
    }

    public void setProductMerchants(List<ProductMerchants> productMerchants) {
        this.productMerchants = productMerchants;
    }

    public String getsku() {
        return sku;
    }

    public void setsku(String sku) {
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

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
