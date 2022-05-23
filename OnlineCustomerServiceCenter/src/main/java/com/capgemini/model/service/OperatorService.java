package com.capgemini.model.service;

import java.util.List;

import com.capgemini.model.dto.CustomerDto;
import com.capgemini.model.dto.IssueDto;
import com.capgemini.model.dto.LoginDto;
import com.capgemini.model.dto.Response;

public interface OperatorService {
		public String login(LoginDto login);
		public Response<IssueDto> addCustomerIssue(IssueDto issue);
		public String sendIntimationEmailToCustomer(int email, int customer);
		public Response<IssueDto> modifyCustomerIssue(IssueDto issue);
		public String sendModificationEmailToCustomer(int email, int customer);
		public Response<IssueDto> closeCustomerIssue(IssueDto issue);
		public Response<CustomerDto> findCustomerById(int customerId);
		public Response<List<CustomerDto>> findCustomerByName(String customerName);
		public Response<CustomerDto> findCustomerByEmail(String customerEmail);
		public boolean lockCustomer(int customer);
}
