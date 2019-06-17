package com.coviam.YoStore.Product.controller;

import com.coviam.YoStore.Product.dto.ProductsDto;
import com.coviam.YoStore.Product.entity.Products;
import com.coviam.YoStore.Product.services.ProductServices;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductsController {
    @Autowired
    ProductServices productServices;

    @RequestMapping(method = RequestMethod.GET,value = "/getProductById/{sku}")
    public ResponseEntity<?> getProductById(@PathVariable("sku") String sku){
        Products products=productServices.viewDetails(sku);
        ProductsDto productsDto=new ProductsDto();
        if(products==null)
            return new ResponseEntity<ProductsDto>(productsDto, HttpStatus.OK);
        BeanUtils.copyProperties(products,productsDto);
        return new ResponseEntity<ProductsDto>(productsDto,HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST,value = "/save")
    public ResponseEntity<String> save(@RequestBody ProductsDto productsDto) {
        Products products = new Products();
        BeanUtils.copyProperties(productsDto, products);
        products = productServices.addProduct(products);
        if (products == null) {
            return new ResponseEntity<String>("Product not saved", HttpStatus.OK);
        } else {
            return new ResponseEntity<String>("Product with Product Name:" + products.getProductName() + " saved to database", HttpStatus.OK);
        }
    }

    @RequestMapping(method = RequestMethod.POST,value = "/updateQuantity/{mid}&{qnt}")
    public ResponseEntity<?> updateProductQuantity(@PathVariable("qnt") int quantity, @PathVariable("mId") String mId, @RequestBody Products products){
        Products product = productServices.updateProductQuantity(mId, products, quantity);
        if (product == null){
            return new ResponseEntity<String>("Update not successful", HttpStatus.OK);
        }
        else {
            return new ResponseEntity<Products>(product, HttpStatus.OK);
        }
    }

    @RequestMapping(method = RequestMethod.GET,value = "/findAll")
    public ResponseEntity<Iterable<Products>> findAll(){
        Iterable<Products> usersList = productServices.findAllProducts();
        return new ResponseEntity<Iterable<Products>>(usersList,HttpStatus.OK);
    }

}
