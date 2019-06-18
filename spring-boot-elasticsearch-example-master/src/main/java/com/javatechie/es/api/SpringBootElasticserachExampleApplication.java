package com.javatechie.es.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javatechie.es.api.model.Product;
import com.javatechie.es.api.repository.ProductRepository;

@SpringBootApplication
@RestController
public class SpringBootElasticserachExampleApplication {
	
	@Autowired
	private ProductRepository repository;
	
	@PostMapping("/saveAllProducts")
	public int saveProduct(@RequestBody List<Product> products) {
		repository.saveAll(products);
		return products.size();
	}

	@GetMapping("/findAllProducts")
	public Iterable<Product> findAllProducts() {
		return repository.findAll();
	}

	@GetMapping("/findByFName/{firstName}")
	public List<Product> findBySku(@PathVariable String sku) {
		return repository.findBySku(sku);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootElasticserachExampleApplication.class, args);
	}
}
