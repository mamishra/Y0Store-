package com.coviam.YoStore.Product;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

@SpringBootApplication
public class ProductApplication extends AbstractMongoConfiguration {

	public static void main(String[] args) {
		SpringApplication.run(ProductApplication.class, args);
	}

	@Override
	protected String getDatabaseName() {
		return "productdb";
	}

	@Override
	public Mongo mongo() throws Exception {
		return new MongoClient( "localhost", 27017);
	}
}
