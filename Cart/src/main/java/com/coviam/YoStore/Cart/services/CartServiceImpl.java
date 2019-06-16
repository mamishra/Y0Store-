package com.coviam.YoStore.Cart.services;

import com.coviam.YoStore.Cart.entity.UserCart;
import com.coviam.YoStore.Cart.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartServiceImpl implements CartService {

    @Autowired
    CartRepository repository;

    @Override
    public UserCart viewCart(String cartId){
        return repository.findOne(cartId);
    }

    @Override
    public UserCart addToCart(UserCart userCart) {
        return repository.insert(userCart);
    }

    @Override
    public boolean remove(String userId) {
        long lng = repository.deleteByUserId(userId);
        return (lng==0)?false:true;
    }
}
