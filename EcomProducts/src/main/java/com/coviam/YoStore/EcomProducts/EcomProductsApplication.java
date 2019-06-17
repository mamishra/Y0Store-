package com.coviam.YoStore.EcomProducts;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

@SpringBootApplication
public class EcomProductsApplication  extends AbstractMongoConfiguration {

	public static void main(String[] args) {
		SpringApplication.run(EcomProductsApplication.class, args);
	}

	@Override
	protected String getDatabaseName() {
		return "ecomproductdb";
	}

	@Override
	public Mongo mongo() throws Exception {
		return new MongoClient( "localhost", 27017);
	}
}

