package com.coviam.YoStore.Merchant.controller;

import com.coviam.YoStore.Merchant.dto.MerchantDto;
import com.coviam.YoStore.Merchant.entity.Merchant;
import com.coviam.YoStore.Merchant.services.MerchantServices;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping("/merchant")
public class MerchantController {
    @Autowired
    MerchantServices merchantServices;

    @RequestMapping(method = RequestMethod.GET,value = "/getRating/{merchantId}")
    public ResponseEntity<Integer> getRating(@PathVariable("merchantId") String merchantId){
        Merchant merchant= merchantServices.findOne(merchantId);
        MerchantDto merchantDto=new MerchantDto();
        if(merchant==null)
            return new ResponseEntity<Integer>(merchantDto.getRating(), HttpStatus.OK);

        BeanUtils.copyProperties(merchant,merchantDto);
        return new ResponseEntity<Integer>(merchantDto.getRating(),HttpStatus.OK);
    }

//    @RequestMapping(method = RequestMethod.GET,value = "/getProducts/{merchantId}")
//    public ResponseEntity<Integer> getProducts(@PathVariable("MerchantId") String merchantId){
//
//    }

    @RequestMapping(method = RequestMethod.GET, value = "/getMerchant/{merchantId}/")
    public  ResponseEntity<Merchant> getMerchant(@PathVariable("marchantId") String merchantId){
        Merchant merchant= merchantServices.findOne(merchantId);
        MerchantDto merchantDto=merchantServices.findOne(merchantId);
        if(merchant==null){

        }
    }

}

