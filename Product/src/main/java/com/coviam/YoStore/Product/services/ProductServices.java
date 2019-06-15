package com.coviam.YoStore.Product.services;

import com.coviam.YoStore.Product.entity.Products;

public interface ProductServices {
    public Products findOne(String sku);
}
