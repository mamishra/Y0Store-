package com.coviam.YoStore.EcomProducts.service;

import com.coviam.YoStore.EcomProducts.entity.Products;

import java.util.List;

public interface ProductServices {

    Products viewDetails(String sku);

    List<Products> addProduct(Iterable<Products> products);

    Products save(Products product);

    Iterable<Products> findAllProducts();

    Products updateProductQuantity(String merchantId, Products products);
}
