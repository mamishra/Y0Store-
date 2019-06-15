package com.coviam.YoStore.Merchant.controller;

import com.coviam.YoStore.Merchant.dto.MerchantsDto;
import com.coviam.YoStore.Merchant.entity.Merchants;
import com.coviam.YoStore.Merchant.services.MerchantsServices;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/merchants")
public class MerchantsController {
    @Autowired
    MerchantsServices merchantsServices;

    @RequestMapping(method = RequestMethod.POST, value = "/putMerchants")
    public ResponseEntity<?> putMerchants(@RequestBody MerchantsDto merchantsDto)
    {
        Merchants merchants = new Merchants();
        BeanUtils.copyProperties(merchantsDto, merchants);
        merchantsServices.insertMerchants(merchants);
        return new ResponseEntity<Merchants>(merchants, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/getAllMerchants")
    public ResponseEntity<List<Merchants>> getAllMerchants()
    {
        List<Merchants> merchants=merchantsServices.findAll();
        MerchantsDto merchantsDto=new MerchantsDto();
        if(merchants==null)
        {
            return null;
        }
        //BeanUtils.copyProperties(orders,ordersDto);
        return new ResponseEntity<List<Merchants>>(merchants, HttpStatus.OK);

    }



    @RequestMapping(method = RequestMethod.GET,value = "/getMerchantRating/{merchantId}")
    public ResponseEntity<Integer> getMerchantRating(@PathVariable("merchantId") String merchantId){
        Merchants merchants = merchantsServices.findOne(merchantId);
        MerchantsDto merchantsDto =new MerchantsDto();
        if(merchants ==null)
            return new ResponseEntity<Integer>(merchantsDto.getRating(), HttpStatus.OK);

        BeanUtils.copyProperties(merchants, merchantsDto);
        return new ResponseEntity<Integer>(merchantsDto.getRating(),HttpStatus.OK);
    }

//    @RequestMapping(method = RequestMethod.GET,value = "/getProducts/{merchantId}")
//    public ResponseEntity<Integer> getProducts(@PathVariable("MerchantId") String merchantId){
//
//    }

//    @RequestMapping(method = RequestMethod.GET, value = "/getMerchant/{merchantId}/")
//    public  ResponseEntity<Merchants> getMerchant(@PathVariable("marchantId") String merchantId){
//        Merchants merchants = merchantsServices.findOne(merchantId);
//        MerchantsDto merchantsDto = merchantsServices.findOne(merchantId);
//        if(merchants ==null)
//    }

}

