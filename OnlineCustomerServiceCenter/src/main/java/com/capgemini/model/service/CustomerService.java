package com.capgemini.model.service;

import java.util.List;
import com.capgemini.model.dto.Issue;
import com.capgemini.model.dto.LoginDto;
import com.capgemini.model.entity.Customer;

public interface CustomerService {

	public String login(LoginDto login);
	public String registerCustomer(Customer customer);
	public Issue viewIssueById(Issue issue);
	public Issue reopenIssue(int issue);
	public List<Issue> viewAllIssues();
	public String changePassword(LoginDto login);
	public String forgetPassword(int password);
	public Customer emailPassword(int email);

}
