package com.coviam.YoStore.Cart.repository;

import com.coviam.YoStore.Cart.entity.CartDetails;
import com.coviam.YoStore.Cart.entity.UserCart;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends MongoRepository<UserCart, String> {
}
