package com.coviam.YoStore.EcomMerchants.repository;

import com.coviam.YoStore.EcomMerchants.entity.Merchants;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

//import java.util.List;

@Repository
public interface MerchantsRepository extends MongoRepository<Merchants,String> {
    Merchants findByMerchantID(String merchantId);
}

