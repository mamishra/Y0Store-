package com.coviam.YoStore.Merchant.repository;

import com.coviam.YoStore.Merchant.entity.Merchant;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MerchantRepository extends MongoRepository<Merchant,String> {

}

