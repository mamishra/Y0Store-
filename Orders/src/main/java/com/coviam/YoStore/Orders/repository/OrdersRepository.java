package com.coviam.YoStore.Orders.repository;

import com.coviam.YoStore.Orders.entity.Orders;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrdersRepository extends MongoRepository<Orders, String> {
    List<Orders> findByUserId(String userId);

    List<Orders> findByUserIdAndOrderDetails(String userId, String productSku);

}
