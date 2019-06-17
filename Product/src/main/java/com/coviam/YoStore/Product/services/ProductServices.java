package com.coviam.YoStore.Product.services;

import com.coviam.YoStore.Product.entity.Products;

import java.util.List;

public interface ProductServices {

    Products viewDetails(String sku);

    Products addProduct(Products product);

    Iterable<Products> findAllProducts();

    Products updateProductQuantity(String merchantId, Products products, int quantBuy);
}
