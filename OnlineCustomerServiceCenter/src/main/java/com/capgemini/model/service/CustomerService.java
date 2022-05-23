package com.capgemini.model.service;

import java.util.List;
import com.capgemini.model.dto.IssueDto;
import com.capgemini.model.dto.CustomerDto;
import com.capgemini.model.dto.Issue;
import com.capgemini.model.dto.LoginDto;
import com.capgemini.model.dto.Response;
import com.capgemini.model.entity.Customer;

public interface CustomerService {

	public String login(LoginDto login);
	public String registerCustomer(Customer customer);
	public Response<IssueDto>viewIssueById(int issueId);
	public Response<Issue> reopenIssue(Issue issue);
	public Response<List<Issue>> viewAllIssues();
	public Response<LoginDto> changePassword(String password);
	public String forgetPassword(int password);
	public Response<CustomerDto> emailPassword(int email);
	public Response<LoginDto> forgetPassword(String password);
	
	
}
