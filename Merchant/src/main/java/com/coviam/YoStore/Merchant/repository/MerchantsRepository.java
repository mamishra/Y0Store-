package com.coviam.YoStore.Merchant.repository;

import com.coviam.YoStore.Merchant.entity.Merchants;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MerchantsRepository extends MongoRepository<Merchants,String> {

}

