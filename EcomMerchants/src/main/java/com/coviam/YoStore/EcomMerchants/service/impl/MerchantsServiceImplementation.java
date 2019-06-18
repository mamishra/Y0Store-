package com.coviam.YoStore.EcomMerchants.service.impl;

import com.coviam.YoStore.EcomMerchants.entity.Merchants;
import com.coviam.YoStore.EcomMerchants.repository.MerchantsRepository;
import com.coviam.YoStore.EcomMerchants.service.MerchantsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MerchantsServiceImplementation implements MerchantsService {

    @Autowired
    MerchantsRepository merchantsRepository;

    @Override
    public Merchants insertMerchants(Merchants merchants) {
        return merchantsRepository.save(merchants);
    }

    @Override
    public Merchants updateMerchant(Merchants merchants) {
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
    public Merchants findByMerchantId(String merchantId){
        return merchantsRepository.findByMerchantID(merchantId);
    }

}
