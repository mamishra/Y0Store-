package com.coviam.YoStore.Cart.controller;

import com.coviam.YoStore.Cart.dto.UserCartDto;
import com.coviam.YoStore.Cart.entity.UserCart;
import com.coviam.YoStore.Cart.services.CartService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping(value="/cart")
public class CartController {

    @Autowired
    CartService service;

    @RequestMapping(method = RequestMethod.GET, value = "/viewcart/{cartId}")
    public ResponseEntity<?> viewCart(@PathVariable ("cartId") String cartId){

        UserCart cart = service.viewCart(cartId);
        UserCartDto cartDto = new UserCartDto();

        if(cart == null){
            return new ResponseEntity<String>("Nothing in your Cart", HttpStatus.OK);
        }
        BeanUtils.copyProperties(cart, cartDto);
        return new ResponseEntity<UserCartDto>(cartDto, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/addToCart")
    public ResponseEntity<?> addToCart(@RequestBody UserCartDto userCartDto){

        UserCart userCart = new UserCart();
        BeanUtils.copyProperties(userCartDto, userCart);
        userCart = service.addToCart(userCart);
        if(userCart == null){
            return new ResponseEntity<String>("Not Added to Cart", HttpStatus.OK);
        }
        else {
            return new ResponseEntity<UserCart>(userCart, HttpStatus.OK);
        }

    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/delete/{userId}")
    public ResponseEntity<?> delete(@PathVariable ("userId") String userId){
        boolean bool = service.remove(userId);
        if(bool == false){
            return new ResponseEntity<String>("Not Deleted from cart", HttpStatus.OK);
        }
        else {
            return new ResponseEntity<String>("Deleted from cart", HttpStatus.OK);
        }
    }


}
