package com.coviam.YoStore.Cart.repository;

import com.coviam.YoStore.Cart.entity.UserCart;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends MongoRepository<UserCart, String> {
    Long deleteByUserId(String userId);
    UserCart findByUserId(String userId);
    //boolean insert(UserCart userCart);
    //boolean update(UserCart userCart);

}
