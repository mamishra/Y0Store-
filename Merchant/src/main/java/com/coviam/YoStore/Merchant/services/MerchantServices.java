package com.coviam.YoStore.Merchant.services;

import com.coviam.YoStore.Merchant.entity.Merchant;

public interface MerchantServices {
    public Merchant findOne(String merchantId);

}
