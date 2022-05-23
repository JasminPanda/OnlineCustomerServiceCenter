package com.capgemini.model.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.capgemini.model.dao.CustomerDao;
import com.capgemini.model.dao.IssueDao;
import com.capgemini.model.dto.Issue;
<<<<<<< HEAD
import com.capgemini.model.dto.IssueDto;
import com.capgemini.model.dto.Login;
=======
import com.capgemini.model.dto.LoginDto;
>>>>>>> branch 'main' of https://github.com/JasminPanda/OnlineCustomerServiceCenter.git
import com.capgemini.model.entity.Customer;
import com.capgemini.model.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

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
public Issue viewIssueById(Issue issue) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Issue reopenIssue(int issue) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public List<Issue> viewAllIssues() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public String changePassword(LoginDto login) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public String forgetPassword(int password) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Customer emailPassword(int email) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public IssueDto viewIssueById(IssueDto issue) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public IssueDto reopenIssue(int issue) {
	// TODO Auto-generated method stub
	return null;
}

}
