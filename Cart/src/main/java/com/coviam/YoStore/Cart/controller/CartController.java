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
    public ResponseEntity<?> viewCart(@PathVariable ("cartId") long cartId){

        UserCart cart = service.viewCart(cartId);
        UserCartDto cartDto = new UserCartDto();

        if(cart == null){
            return new ResponseEntity<String>("Not Found", HttpStatus.OK);
        }
        BeanUtils.copyProperties(cart, cartDto);
        return new ResponseEntity<UserCartDto>(cartDto, HttpStatus.OK);
    }

    //TODO: other two methods


}
