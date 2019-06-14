package com.coviam.YoStore.Cart.services;

import com.coviam.YoStore.Cart.entity.UserCart;
import com.coviam.YoStore.Cart.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class CartServiceImpl implements CartService {

    @Autowired
    CartRepository repository;

    @Override
    public UserCart viewCart(long cartId){
        return repository.findOne(String.valueOf(cartId));
    }

    //TODO: other tho methods to be corrected

    @Override
    public boolean addToCart(String SKU) {
        HashMap<Integer,String> li = new HashMap<>();
        li.put(1, SKU);
        repository.save(li);
    }

    @Override
    public boolean remove(long cartId, String SKU) {
        return repository.delete(SKU);
    }
}
