package com.example.StoreApp;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreAppApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(StoreAppApplication.class, args);
		var orderSevice = context.getBean(OrderSevice.class);
		orderSevice.placeOrder();

	}

}
