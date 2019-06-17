package com.coviam.YoStore.Product.dto;

import java.util.ArrayList;
import java.util.List;

public class ProductsDto {

    private String sku;
    private double mrp;
    private String brand;
    private String imgurl;
    private List<ProductMerchantsDto> productMerchants;
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

    public List<ProductMerchantsDto> getProductMerchants() {
        return productMerchants;
    }

    public void setProductMerchants(List<ProductMerchantsDto> productMerchants) {
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

    public ProductsDto() {
        this.productMerchants = new ArrayList<>();
    }

    public ProductsDto(String sku, double mrp, String brand, String imgurl, List<ProductMerchantsDto> productMerchants, int quantity, String category, String productDetails, String productName) {
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
        return "ProductsDto{" +
                "sku='" + sku + '\'' +
                ", mrp=" + mrp +
                ", brand='" + brand + '\'' +
                ", imgurl='" + imgurl + '\'' +
                ", productMerchantsDto=" + productMerchants +
                ", quantity=" + quantity +
                ", category='" + category + '\'' +
                ", productDetails='" + productDetails + '\'' +
                ", productName='" + productName + '\'' +
                '}';
    }
}
