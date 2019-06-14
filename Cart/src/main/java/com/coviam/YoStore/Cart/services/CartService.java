package com.coviam.YoStore.Cart.services;

import com.coviam.YoStore.Cart.entity.UserCart;

public interface CartService {

    UserCart viewCart(long cartId);
    boolean addToCart(String SKU);
    boolean remove(long cartId, String SKU);

}
