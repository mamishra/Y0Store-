package com.coviam.YoStore.Merchant.repository;

import com.coviam.YoStore.Merchant.entity.Merchants;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MerchantsRepository extends MongoRepository<Merchants,String> {


    List<Merchants> findByMerchantIDAndMerchantProducts(String merchantId, String productSku);

}

