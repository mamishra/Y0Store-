package com.coviam.YoStore.Merchant.repository;

<<<<<<< Updated upstream
public interface MerchantRepository {
=======
import com.coviam.YoStore.Merchant.entity.Merchant;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MerchantRepository extends MongoRepository<Merchant,String> {

>>>>>>> Stashed changes
}
