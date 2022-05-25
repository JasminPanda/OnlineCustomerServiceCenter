package com.capgemini.model;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.capgemini.model.entity.Department;
import com.capgemini.model.entity.OperatorEntity;
@SpringBootApplication(scanBasePackages = {"com.capgemini.model","com.capgemini.model.entity"})
public class OnlineCustomerServiceCenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineCustomerServiceCenterApplication.class, args);
	}
	
	
	@Bean 
	public Department getDepartment() {
		return new Department();
	}
	
	
	@Bean 
	public OperatorEntity getOperator() {
		return new OperatorEntity();
	}

}
