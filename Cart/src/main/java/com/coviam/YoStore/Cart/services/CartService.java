package com.coviam.YoStore.Cart.services;

import com.coviam.YoStore.Cart.entity.UserCart;

public interface CartService {

    UserCart viewCart(String cartId);
    UserCart addToCart(UserCart userCart);
    boolean remove(String userId);

}
