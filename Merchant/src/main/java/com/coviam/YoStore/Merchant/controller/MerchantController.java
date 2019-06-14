package com.coviam.YoStore.Merchant.controller;

import com.coviam.YoStore.Merchant.services.MerchantServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping("/merchant")
public class MerchantController {
    @Autowired
    MerchantServices merchantServices;

    @RequestMapping(method = RequestMethod.GET,value="get"){
    }
}

