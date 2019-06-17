package com.coviam.YoStore.Merchant.services.impl;


import com.coviam.YoStore.Merchant.entity.Merchants;
import com.coviam.YoStore.Merchant.repository.MerchantsRepository;
import com.coviam.YoStore.Merchant.services.MerchantsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MerchantsServicesImplementation implements MerchantsServices {

    @Autowired
    MerchantsRepository merchantsRepository;

    @Override
    public Merchants insertMerchants(Merchants merchants) {
        return merchantsRepository.save(merchants);
    }

    @Override
    public Merchants findOne(String merchantId){
        return merchantsRepository.findOne(merchantId);
    }

    @Override
    public List<Merchants> findAll() {
        List<Merchants> merchants = this.merchantsRepository.findAll();
        return merchants;
    }

    @Override
    public List<Merchants> findProductMerchants(String merchantId, String productSku){
        List<Merchants> merchants = this.merchantsRepository.findByMerchantIDAndMerchantProducts(merchantId, productSku);
        return merchants;
    }

}
