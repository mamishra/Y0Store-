package com.coviam.YoStore.Merchant.services;


import com.coviam.YoStore.Merchant.entity.Merchant;
import com.coviam.YoStore.Merchant.repository.MerchantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MerchantServicesImpl implements MerchantServices {
    @Autowired
    MerchantRepository merchantRepository;

    @Override
    public Merchant findOne(String merchantId){
        return merchantRepository.findOne(merchantId);
    }

}
