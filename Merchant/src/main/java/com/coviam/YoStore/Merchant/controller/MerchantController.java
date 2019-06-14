package com.coviam.YoStore.Merchant.controller;

<<<<<<< Updated upstream
public class MerchantController {
=======
import com.coviam.YoStore.Merchant.services.MerchantServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/merchant")
public class MerchantController {
    @Autowired
    MerchantServices merchantServices;

    @RequestMapping(method = RequestMethod.GET,value="get")

>>>>>>> Stashed changes
}
