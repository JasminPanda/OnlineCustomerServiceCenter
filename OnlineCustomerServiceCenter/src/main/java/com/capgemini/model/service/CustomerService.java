package com.capgemini.model.service;

import java.util.List;
import com.capgemini.model.dto.Issue;
import com.capgemini.model.dto.CustomerDto;
import com.capgemini.model.dto.LoginDto;
import com.capgemini.model.dto.Response;

public interface CustomerService {

	public String login(LoginDto login);
	public String registerCustomer(CustomerDto customer);
	public Response<Issue> viewIssueById(int issueId);
	public Response<Issue> reopenIssue(int issue);
	public Response<List<Issue>> viewAllIssues();
	public String changePassword(LoginDto login);
	public String forgetPassword(int password);
	public Response<CustomerDto> emailPassword(int email);
		
	
}
