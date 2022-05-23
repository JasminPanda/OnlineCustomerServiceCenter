package com.capgemini.model.service;

import java.util.List;
import com.capgemini.model.dto.IssueDto;
import com.capgemini.model.dto.Login;
import com.capgemini.model.entity.Customer;

public interface CustomerService {

	public String login(Login login);
	public String registerCustomer(Customer customer);
	public IssueDto viewIssueById(IssueDto issue);
	public IssueDto reopenIssue(int issue);
	public List<IssueDto> viewAllIssues();
	public String changePassword(Login login);
	public String forgetPassword(int password);
	public Customer emailPassword(int email);

}
