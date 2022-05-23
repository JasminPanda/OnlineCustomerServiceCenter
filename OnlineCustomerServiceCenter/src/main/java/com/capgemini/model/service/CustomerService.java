package com.capgemini.model.service;

import java.util.List;
<<<<<<< HEAD
import com.capgemini.model.dto.IssueDto;
import com.capgemini.model.dto.Login;
=======
import com.capgemini.model.dto.Issue;
import com.capgemini.model.dto.LoginDto;
>>>>>>> branch 'main' of https://github.com/JasminPanda/OnlineCustomerServiceCenter.git
import com.capgemini.model.entity.Customer;

public interface CustomerService {

	public String login(LoginDto login);
	public String registerCustomer(Customer customer);
<<<<<<< HEAD
	public IssueDto viewIssueById(IssueDto issue);
	public IssueDto reopenIssue(int issue);
	public List<IssueDto> viewAllIssues();
	public String changePassword(Login login);
=======
	public Issue viewIssueById(Issue issue);
	public Issue reopenIssue(int issue);
	public List<Issue> viewAllIssues();
	public String changePassword(LoginDto login);
>>>>>>> branch 'main' of https://github.com/JasminPanda/OnlineCustomerServiceCenter.git
	public String forgetPassword(int password);
	public Customer emailPassword(int email);

}
