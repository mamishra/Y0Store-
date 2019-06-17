package com.coviam.YoStore.Product.repository;

import com.coviam.YoStore.Product.entity.ProductMerchants;
import com.coviam.YoStore.Product.entity.Products;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Products,String> {
}
