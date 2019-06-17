package com.coviam.YoStore.Product.services;

import com.coviam.YoStore.Product.entity.ProductMerchants;
import com.coviam.YoStore.Product.entity.Products;
import com.coviam.YoStore.Product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServicesImpl  implements ProductServices{
    @Autowired
    ProductRepository productRepository;

    @Override
    public Products viewDetails(String sku){
        return productRepository.findOne(sku);
    }

    @Override
    public Products addProduct(Products product) {
        return productRepository.save(product);
    }

    @Override
    public Iterable<Products> findAllProducts() {
        return (Iterable<Products>) productRepository.findAll();
    }

    @Override
    public Products updateProductQuantity(String merchantId, Products products, int quantBuy) {
        Products prod = products;
        List<ProductMerchants> merchantsList = prod.getMerchants();
        merchantsList.forEach((li)->{
            if (li.getMerchantId().equals(merchantId)){
                int temp = li.getQuantity();
                temp -= quantBuy;
                li.setQuantity(temp);
            }
        });
        int quantity = prod.getQuantity();
        quantity -= quantBuy;
        prod.setQuantity(quantity);
        return productRepository.save(prod);
    }
}
