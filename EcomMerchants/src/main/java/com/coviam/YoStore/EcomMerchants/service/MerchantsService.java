package com.coviam.YoStore.EcomMerchants.service;

import com.coviam.YoStore.EcomMerchants.entity.Merchants;

import java.util.List;

public interface MerchantsService {
    Merchants insertMerchants(Merchants merchants);
    List<Merchants> findAll();
    Merchants findOne(String merchantId);
    Merchants findByMerchantId(String merchantId);
}
