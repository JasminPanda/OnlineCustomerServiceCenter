package com.capgemini.model.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.capgemini.model.dao.CustomerDao;
import com.capgemini.model.dao.IssueDao;
import com.capgemini.model.dto.CustomerDto;
import com.capgemini.model.dto.Issue;
import com.capgemini.model.dto.IssueDto;
import com.capgemini.model.dto.LoginDto;
import com.capgemini.model.dto.Response;
import com.capgemini.model.entity.Customer;
import com.capgemini.model.service.CustomerService;

@Service
public  class CustomerServiceImpl implements CustomerService {

   @Autowired
   private CustomerDao dao;
   
   @Autowired
   private IssueDao issuedao;

@Override
public String login(LoginDto login) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public String registerCustomer(Customer customer) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Response<IssueDto>viewIssueById(int issueId) {
	return null;
}


@Override
public Response<Issue> reopenIssue(Issue issue) {
	return null;
} 
	


@Override
public Response<List<Issue>> viewAllIssues() {
	return null;
} 

@Override
public Response<LoginDto> changePassword(String password) {
	return null;
} 

@Override
public Response<CustomerDto> emailPassword(int email) {
	
	return null;
}
@Override
public Response<LoginDto> forgetPassword(String password) {
	return null;
}



}

