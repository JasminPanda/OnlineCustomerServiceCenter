package com.capgemini.model.service;

import java.util.List;

import com.capgemini.model.dto.CustomerDto;
import com.capgemini.model.dto.Issue;
import com.capgemini.model.dto.LoginDto;
import com.capgemini.model.dto.Response;

public interface OperatorService {
		public String login(LoginDto login);
		public Response<Issue> addCustomerIssue(Issue issue);
		public String sendIntimationEmailToCustomer(int operatorId, int customerId);
		public Response<Issue> modifyCustomerIssue(Issue issue);
		public String sendModificationEmailToCustomer(int operatorId, int customerId);
		public Response<Issue> closeCustomerIssue(Issue issue);
		public Response<CustomerDto> findCustomerById(int customerId);
		public Response<List<CustomerDto>> findCustomerByName(String customerName);
		public Response<CustomerDto> findCustomerByEmail(String customerEmail);
		public boolean lockCustomer(int customer);
}
