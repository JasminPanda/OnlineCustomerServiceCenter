package com.capgemini.model;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication(scanBasePackages = "com.capgemini.model")
public class OnlineCustomerServiceCenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineCustomerServiceCenterApplication.class, args);
	}

}
