package com.coviam.YoStore.Product.dto;

import com.coviam.YoStore.Product.entity.ProductDetails;

public class ProductsDto {

    private String SKU;
    private double mrp;
    private String brand;
    private String imgurl;
    private String[] merchants;
    private int quantity;
    private int[] quantityMerchant;
    private String category;
    private ProductDetails productDetails;
    private String productName;

    public String getSKU() {
        return SKU;
    }

    public void setSKU(String SKU) {
        this.SKU = SKU;
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

    public String[] getMerchants() {
        return merchants;
    }

    public void setMerchants(String[] merchants) {
        this.merchants = merchants;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int[] getQuantityMerchant() {
        return quantityMerchant;
    }

    public void setQuantityMerchant(int[] quantityMerchant) {
        this.quantityMerchant = quantityMerchant;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public ProductDetails getProductDetails() {
        return productDetails;
    }

    public void setProductDetails(ProductDetails productDetails) {
        this.productDetails = productDetails;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
