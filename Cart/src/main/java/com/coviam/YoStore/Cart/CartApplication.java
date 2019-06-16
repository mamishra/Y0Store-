package com.coviam.YoStore.Cart;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

@SpringBootApplication
public class CartApplication extends AbstractMongoConfiguration {

	public static void main(String[] args) {
		SpringApplication.run(CartApplication.class, args);
	}

	@Override
	protected String getDatabaseName() {
		return "cartdb";
	}

	@Override
	public Mongo mongo() throws Exception {
		return new MongoClient("localhost", 27017);
	}
}
