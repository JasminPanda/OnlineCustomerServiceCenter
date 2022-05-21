package com.capgemini.model.service;

import java.util.List;

import com.capgemini.model.dto.CustomerDto;
import com.capgemini.model.dto.Issue;
import com.capgemini.model.dto.LoginDto;

public interface OperatorService {
		public String login(LoginDto login);
		public Issue addCustomerIssue(Issue issue);
		public String sendIntimationEmailToCustomer(int email, int customer);
		public Issue modifyCustomerIssue(Issue issue);
		public String sendModificationEmailToCustomer(int email, int customer);
		public Issue closeCustomerIssue(Issue issue);
		public CustomerDto findCustomerById(int customer);
		public List<CustomerDto> findCustomerByName(String customer);
		public CustomerDto findCustomerByEmail(String customer);
		public boolean lockCustomer(int customer);
}
