package com.capgemini.model.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.model.dto.CustomerDto;
import com.capgemini.model.dto.IssueDto;
import com.capgemini.model.dto.LoginDto;
import com.capgemini.model.dto.Response;
import com.capgemini.model.service.CustomerService;

@RestController("customers")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping(value="/{issueId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Response<IssueDto> viewIssueById(@PathVariable("issueId") int issueId){
		return customerService.viewIssueById(issueId);
	}
	
	@PutMapping(value="/openIssue",consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Response<IssueDto> reOpenIssue(@RequestBody int issue){
		return customerService.reopenIssue(issue);
	}
	@PutMapping(value="viewIssues", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Response<List<IssueDto>> viewAllIssues(@RequestBody IssueDto issue){
		return customerService.viewAllIssues();
	}
	@GetMapping(value="/{changePassword}", produces = MediaType.APPLICATION_JSON_VALUE)
	public String changePassword(@PathVariable("changePassword") LoginDto login){
		return customerService.changePassword(login);
	}
	@GetMapping(value="/{password}", produces = MediaType.APPLICATION_JSON_VALUE)
	public String forgetPassword(@PathVariable("password") int password){
		return customerService.forgetPassword(password);
	}
	@GetMapping(value="/{email}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Response<CustomerDto> emailPassword(@PathVariable("email") int email){
		return customerService.emailPassword(email);
	}
}
