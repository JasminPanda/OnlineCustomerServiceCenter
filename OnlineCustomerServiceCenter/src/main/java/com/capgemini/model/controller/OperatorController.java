package com.capgemini.model.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.model.dto.CustomerDto;
import com.capgemini.model.dto.IssueDto;
import com.capgemini.model.dto.Response;
import com.capgemini.model.service.OperatorService;

@RestController
@RequestMapping("/operator")
public class OperatorController {
		
		@Autowired
		private OperatorService operatorService;
			
		@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE )
		public Response<IssueDto> addIssue(@RequestBody IssueDto issue){
			return operatorService.addCustomerIssue(issue);
		}
		
		@PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
		public Response<IssueDto> modifyIssue(@RequestBody IssueDto issue){
			return operatorService.modifyCustomerIssue(issue);
		}
		
		@GetMapping(value="/{customerId}", produces = MediaType.APPLICATION_JSON_VALUE)
		public Response<CustomerDto> findCustomerById(@PathVariable("customerId") Integer customerId){
			return operatorService.findCustomerById(customerId);
		}
		
		@GetMapping(value="/{customerEmail}", produces = MediaType.APPLICATION_JSON_VALUE)
		public Response<CustomerDto> findCustomerByEmail(@PathVariable("customerEmail") String customerEmail){
			return operatorService.findCustomerByEmail(customerEmail);
		}
		
		@GetMapping(value="/{customerName}", produces = MediaType.APPLICATION_JSON_VALUE)
		public Response<List<CustomerDto>> findCustomerByName(@PathVariable("customerName") String customerName){
			return operatorService.findCustomerByName(customerName);
		}
		
		@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
		public Response<IssueDto> closeCustomerIssue(@RequestBody IssueDto issue){
			return operatorService.closeCustomerIssue(issue);
		}
}
