package com.coviam.YoStore.Cart.controller;

import com.coviam.YoStore.Cart.dto.UserCartDto;
import com.coviam.YoStore.Cart.entity.CartDetails;
import com.coviam.YoStore.Cart.entity.UserCart;
import com.coviam.YoStore.Cart.services.CartService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping(value="/cart")
@CrossOrigin("*")
public class CartController {

    @Autowired
    CartService service;

    @RequestMapping(method = RequestMethod.GET, value = "/viewcart")
    public ResponseEntity<?> viewCart(@RequestParam ("userId") String userId){

        UserCart cart = service.viewCart(userId);
        UserCartDto cartDto = new UserCartDto();

        if(cart == null){
            return new ResponseEntity<Boolean>(false, HttpStatus.OK);
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

    @RequestMapping(method = RequestMethod.DELETE, value = "/delete")
    public ResponseEntity<?> delete(@RequestParam ("userId") String userId){
        boolean bool = service.remove(userId);
        if(bool == false){
            return new ResponseEntity<String>("Not Deleted from cart", HttpStatus.OK);
        }
        else {
            return new ResponseEntity<String>("Deleted from cart", HttpStatus.OK);
        }
    }

    @RequestMapping(method = RequestMethod.POST,value = "/updateCart")
    public ResponseEntity<?> updateCart(@RequestBody CartDetails cartDetails, @RequestParam("userId") String userId)
    {
        boolean result = service.updateCart(cartDetails,userId);
        if(result == false){
            return new ResponseEntity<String>("Not Updated in cart", HttpStatus.OK);
        }
        else {
            return new ResponseEntity<String>("Updated in cart", HttpStatus.OK);
        }
    }


}
