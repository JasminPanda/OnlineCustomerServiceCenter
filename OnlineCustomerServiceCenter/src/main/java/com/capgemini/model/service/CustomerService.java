package com.capgemini.model.service;

import java.util.List;

import com.capgemini.model.dto.IssueDto;
import com.capgemini.model.dto.LoginDto;
import com.capgemini.model.entity.Customer;

public interface CustomerService {

	public String login(LoginDto login);
	public String registerCustomer(Customer customer);
	public IssueDto viewIssueById(int issueId);
	public IssueDto reopenIssues(int issueId);
	public List<IssueDto> viewAllIssues();
	public String changePassword(LoginDto login);
	public String forgetPassword(int username);
	public Customer emailPassword(int customerId);

}
