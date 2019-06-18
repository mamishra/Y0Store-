package com.javatechie.es.api.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.util.HashMap;
import java.util.List;

@Document(indexName="yostore",type="products")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    private String sku;
    private String mrp;
    private String brand;
    private String imgurl;
    private String quantity;
    private String[] merchantsMerchantId;
    private String[] merchantsQuantity;
    private String productDetails;


}
