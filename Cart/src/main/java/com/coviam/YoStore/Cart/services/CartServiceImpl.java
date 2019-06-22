package com.coviam.YoStore.Cart.services;

import com.coviam.YoStore.Cart.entity.CartDetails;
import com.coviam.YoStore.Cart.entity.UserCart;
import com.coviam.YoStore.Cart.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CartServiceImpl implements CartService {

    @Autowired
    CartRepository repository;

    @Override
    public boolean updateCart(CartDetails cartDetails, String userId) {
        UserCart uCart = repository.findOne(userId);
        List<CartDetails> li = uCart.getDetails();
        li.add(cartDetails);
        uCart.setDetails(li);
        remove(userId);
        return (repository.save(uCart)==null)?false:true;
    }

    @Override
    public UserCart viewCart(String userId){
        return repository.findOne(userId);


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
