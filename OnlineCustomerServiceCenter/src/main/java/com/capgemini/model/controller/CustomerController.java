package com.capgemini.model.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.model.service.CustomerService;

@RestController("customers")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;

}
