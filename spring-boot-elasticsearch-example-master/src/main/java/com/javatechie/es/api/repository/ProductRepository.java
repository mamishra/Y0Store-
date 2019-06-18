package com.javatechie.es.api.repository;

import java.util.List;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.javatechie.es.api.model.Product;

public interface ProductRepository extends ElasticsearchRepository<Product, String>{

	List<Product> findBySku(String sku);

}
