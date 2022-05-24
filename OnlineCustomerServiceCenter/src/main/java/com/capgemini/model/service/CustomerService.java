package com.capgemini.model.service;

import java.util.List;

import com.capgemini.model.dto.IssueDto;
<<<<<<< HEAD
import com.capgemini.model.dto.CustomerDto;
=======
>>>>>>> branch 'Kanchan_Branch1' of https://github.com/JasminPanda/OnlineCustomerServiceCenter.git
import com.capgemini.model.dto.LoginDto;
import com.capgemini.model.dto.Response;

public interface CustomerService {

	public String login(LoginDto login);
<<<<<<< HEAD
	public String registerCustomer(CustomerDto customer);
	public Response<IssueDto> viewIssueById(int issueId);
	public Response<IssueDto> reopenIssue(int issue);
	public Response<List<IssueDto>> viewAllIssues();
=======
	public String registerCustomer(Customer customer);
	public IssueDto viewIssueById(int issueId);
	public IssueDto reopenIssues(int issueId);
	public List<IssueDto> viewAllIssues();
>>>>>>> branch 'Kanchan_Branch1' of https://github.com/JasminPanda/OnlineCustomerServiceCenter.git
	public String changePassword(LoginDto login);
<<<<<<< HEAD
	public String forgetPassword(int password);
	public Response<CustomerDto> emailPassword(int email);	
	
	
=======
	public String forgetPassword(int username);
	public Customer emailPassword(int customerId);

>>>>>>> branch 'Kanchan_Branch1' of https://github.com/JasminPanda/OnlineCustomerServiceCenter.git
}
