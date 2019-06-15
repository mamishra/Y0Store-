package com.coviam.YoStore.Product.controller;

import com.coviam.YoStore.Product.dto.ProductsDto;
import com.coviam.YoStore.Product.entity.Products;
import com.coviam.YoStore.Product.services.ProductServices;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductsController {
    @Autowired
    ProductServices productServices;

    @RequestMapping(method = RequestMethod.GET,value = "/getProductById/{sku}")
    public ResponseEntity<?> getProductById(@PathVariable("sku") String sku){
        Products products=productServices.findOne(sku);
        ProductsDto productsDto=new ProductsDto();
        if(products==null)
            return new ResponseEntity<ProductsDto>(productsDto, HttpStatus.OK);
        BeanUtils.copyProperties(products,productsDto);
        return new ResponseEntity<ProductsDto>(productsDto,HttpStatus.OK);
    }

//    @RequestMapping(method = RequestMethod.POST,value= "/updateProduct/{sku}/{quantitySold}/{merchantId}")
//    public ResponseEntity<?> uodateP
//    {
//
//    }


}
