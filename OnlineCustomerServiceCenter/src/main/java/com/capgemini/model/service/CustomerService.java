package com.capgemini.model.service;

import java.util.List;
import com.capgemini.model.dto.IssueDto;
import com.capgemini.model.dto.CustomerDto;
import com.capgemini.model.dto.LoginDto;
import com.capgemini.model.dto.Response;

public interface CustomerService {

	public String login(LoginDto login);
	public String registerCustomer(CustomerDto customer);
	public Response<IssueDto> viewIssueById(int issueId);
	public Response<IssueDto> reopenIssue(int issue);
	public Response<List<IssueDto>> viewAllIssues();
	public String changePassword(LoginDto login);
	public String forgetPassword(int password);
	public Response<CustomerDto> emailPassword(int email);	
	
	
}
