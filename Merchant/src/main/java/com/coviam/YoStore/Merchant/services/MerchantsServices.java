package com.coviam.YoStore.Merchant.services;

import com.coviam.YoStore.Merchant.entity.Merchants;

import java.util.List;

public interface MerchantsServices {
    Merchants insertMerchants(Merchants merchants);
    List<Merchants> findAll();
    Merchants findOne(String merchantId);
    List<Merchants> findProductMerchants(String merchantId, String productSku);

}
