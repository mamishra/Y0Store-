package com.coviam.YoStore.EcomProducts.service;

import com.coviam.YoStore.EcomProducts.entity.ProductMerchant;
import com.coviam.YoStore.EcomProducts.entity.Products;
import com.coviam.YoStore.EcomProducts.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServicesImpl implements ProductServices {

    @Autowired
    ProductRepository prodRepository;

    @Override
    public Products viewDetails(String sku) {
        return prodRepository.findBySku(sku);
    }

    @Override
    public List<Products> addProduct(Iterable<Products> product) {
        return prodRepository.save(product);
    }

    @Override
    public Products save(Products product) {
        return prodRepository.save(product);
    }

    @Override
    public Iterable<Products> findAllProducts() {
        return prodRepository.findAll();
    }

    @Override
    public Products updateProductQuantity(String merchantId, Products products) {
        Products prod = products;
        String localSku = prod.getSku();
        Products product = prodRepository.findBySku(localSku);
        List<ProductMerchant> productMerchantsList = product.getProductMerchants();
        productMerchantsList.forEach((li)->{
            if (li.getMerchantId().equals(merchantId)){
                int temp = li.getQuantity();
                temp--;
                li.setQuantity(temp);
            }
        });
        System.out.println(productMerchantsList);
        product.setProductMerchants(productMerchantsList);
        System.out.println(product);
        int quantity = product.getQuantity();
        quantity--;
        product.setQuantity(quantity);
        System.out.println(product);
        return prodRepository.save(product);
    }
}
