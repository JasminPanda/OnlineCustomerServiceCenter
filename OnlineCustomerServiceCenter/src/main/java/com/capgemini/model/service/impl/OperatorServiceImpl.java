package com.capgemini.model.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.model.dao.OperatorDao;
import com.capgemini.model.dto.CustomerDto;
import com.capgemini.model.dto.IssueDto;
import com.capgemini.model.dto.LoginDto;
import com.capgemini.model.dto.Response;
import com.capgemini.model.service.OperatorService;

@Service
public class OperatorServiceImpl implements OperatorService {
	
	@Autowired
	private OperatorDao operatorDao;

	@Override
	public String login(LoginDto login) {
		
		return null;
	}

	@Override
	public Response<IssueDto> addCustomerIssue(IssueDto issue) {
		
		return null;
	}

	@Override
	public String sendIntimationEmailToCustomer(int email, int customer) {
		
		return null;
	}

	@Override
	public Response<IssueDto> modifyCustomerIssue(IssueDto issue) {

		return null;
	}

	@Override
	public String sendModificationEmailToCustomer(int email, int customer) {

		return null;
	}

	@Override
	public Response<IssueDto> closeCustomerIssue(IssueDto issue) {

		return null;
	}

	@Override
	public Response<CustomerDto> findCustomerById(int customerId) {

		return null;
	}

	@Override
	public Response<List<CustomerDto>> findCustomerByName(String customerName) {

		return null;
	}

	@Override
	public Response<CustomerDto> findCustomerByEmail(String customerEmail) {

		return null;
	}

	@Override
	public boolean lockCustomer(int customer) {

		return false;
	}

}
