package com.capgemini.model;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@SpringBootApplication(scanBasePackages = "com.capgemini.model")
public class OnlineCustomerServiceCenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineCustomerServiceCenterApplication.class, args);
	}

}
