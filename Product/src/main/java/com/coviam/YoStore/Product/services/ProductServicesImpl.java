package com.coviam.YoStore.Product.services;

import com.coviam.YoStore.Product.entity.Products;
import com.coviam.YoStore.Product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServicesImpl  implements ProductServices{
    @Autowired
    ProductRepository productRepository;

    @Override
    public Products findOne(String sku){
        return productRepository.findOne(sku);
    }
}
