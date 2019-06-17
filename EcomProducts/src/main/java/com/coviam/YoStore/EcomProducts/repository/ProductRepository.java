package com.coviam.YoStore.EcomProducts.repository;

import com.coviam.YoStore.EcomProducts.entity.Products;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends MongoRepository<Products,String> {
    Products findBySku(String sku);
    Products save(Products products);
}
