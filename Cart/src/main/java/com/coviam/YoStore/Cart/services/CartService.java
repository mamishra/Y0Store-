package com.coviam.YoStore.Cart.services;

import com.coviam.YoStore.Cart.entity.CartDetails;
import com.coviam.YoStore.Cart.entity.UserCart;

public interface CartService {

    UserCart viewCart(String userId);
    UserCart addToCart(UserCart userCart);
    boolean remove(String userId);
    boolean updateCart(CartDetails cartDetails, String userId);

}
