package com.coviam.YoStore.EcomMerchants.controller;

import com.coviam.YoStore.EcomMerchants.dto.MerchantProductsDto;
import com.coviam.YoStore.EcomMerchants.dto.MerchantsDto;
import com.coviam.YoStore.EcomMerchants.entity.MerchantProducts;
import com.coviam.YoStore.EcomMerchants.entity.Merchants;
import com.coviam.YoStore.EcomMerchants.service.MerchantsService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestController
@RequestMapping("/merchants")
public class MerchantsController {

    @Autowired
    MerchantsService merchantsService;

    @RequestMapping(method = RequestMethod.POST, value = "/putMerchants")
    public ResponseEntity<?> putMerchants(@RequestBody MerchantsDto merchantsDto)
    {
        Merchants merchants = new Merchants();
        BeanUtils.copyProperties(merchantsDto, merchants);
        merchantsService.insertMerchants(merchants);
        return new ResponseEntity<Merchants>(merchants, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/getMerchantsByProductSku/{array}")
    public ResponseEntity<MerchantsDto> getMerchantsByProductSku(@PathVariable("array") String array)
    {
        String[] arr = array.split("_");
        String productSku = arr[0];
        String merchantId = arr[1];
        Merchants merchant = merchantsService.findByMerchantId(merchantId);
        MerchantsDto merchantDto=new MerchantsDto();
        if(merchant==null)
        {
            return null;
        }
        BeanUtils.copyProperties(merchant,merchantDto);
        MerchantsDto merchantDto2=new MerchantsDto();
        merchantDto2.setCategory(merchantDto.getCategory());
        merchantDto2.setMerchantID(merchantDto.getMerchantID());
        merchantDto2.setQuantitySold(merchantDto.getQuantitySold());
        merchantDto2.setRating(merchantDto.getRating());
        //MerchantProductsDto merchantProductDto = new MerchantProductsDto();
        List<MerchantProductsDto> merchantProductsDto = new ArrayList<>();
        merchantProductsDto = merchantDto.getMerchantProducts();
        List<MerchantProductsDto> mProdList = new ArrayList<>();
        MerchantProductsDto mPDto = new MerchantProductsDto();
        for (MerchantProductsDto merchantProdD : merchantProductsDto){
            if (merchantProdD!=null && merchantProdD.getProductId().equals(productSku) && merchantProdD.getQuantity()!=0){
                BeanUtils.copyProperties(merchantProdD,mPDto);
            }
        }
        mProdList.add(mPDto);
        merchantDto2.setMerchantProducts(mProdList);

        return new ResponseEntity<MerchantsDto>(merchantDto2, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/getAllMerchants")
    public ResponseEntity<List<Merchants>> getAllMerchants()
    {
        List<Merchants> merchants=merchantsService.findAll();
        MerchantsDto merchantsDto=new MerchantsDto();
        if(merchants==null)
        {
            return null;
        }
        //BeanUtils.copyProperties(orders,ordersDto);
        return new ResponseEntity<List<Merchants>>(merchants, HttpStatus.OK);

    }
}
