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
<<<<<<< HEAD
		public Response<IssueDto> addCustomerIssue(@RequestBody IssueDto issue){
=======
		public Response<IssueDto> addIssue(@RequestBody IssueDto issue){
>>>>>>> branch 'Kanchan_Branch1' of https://github.com/JasminPanda/OnlineCustomerServiceCenter.git
			return operatorService.addCustomerIssue(issue);
		}
		
		@PostMapping(value="/{customerId}/sendEmail", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE )
		public String sendIntimationEmailToCustomer(@RequestBody int operatorId, int customerId){
			return operatorService.sendIntimationEmailToCustomer(operatorId, customerId);
		}
		
		@PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
<<<<<<< HEAD
		public Response<IssueDto> modifyCustomerIssue(@RequestBody IssueDto issue){
=======
		public Response<IssueDto> modifyIssue(@RequestBody IssueDto issue){
>>>>>>> branch 'Kanchan_Branch1' of https://github.com/JasminPanda/OnlineCustomerServiceCenter.git
			return operatorService.modifyCustomerIssue(issue);
		}
		
		@PostMapping(value="/{operatorId}/sendEmail/{customerId}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE )
		public String sendModificationEmailToCustomer(@RequestBody int operatorId, int customerId){
			return operatorService.sendModificationEmailToCustomer(operatorId, customerId);
		}
		
		@PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
		public Response<IssueDto> closeCustomerIssue(@RequestBody IssueDto issue){
			return operatorService.closeCustomerIssue(issue);
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
<<<<<<< HEAD
		}		
=======
		}
		
		@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
		public Response<IssueDto> closeCustomerIssue(@RequestBody IssueDto issue){
			return operatorService.closeCustomerIssue(issue);
		}
>>>>>>> branch 'Kanchan_Branch1' of https://github.com/JasminPanda/OnlineCustomerServiceCenter.git
}
