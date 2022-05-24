package com.capgemini.model.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.capgemini.model.dao.CustomerDao;
import com.capgemini.model.dto.CustomerDto;
import com.capgemini.model.dto.IssueDto;
<<<<<<< HEAD
import com.capgemini.model.dto.LoginDto;
import com.capgemini.model.dto.Response;
=======
import com.capgemini.model.dto.Login;
import com.capgemini.model.entity.Customer;
>>>>>>> branch 'Kanchan_Branch1' of https://github.com/JasminPanda/OnlineCustomerServiceCenter.git
import com.capgemini.model.service.CustomerService;

@Service
public  class CustomerServiceImpl implements CustomerService {

	@Override
	public String login(LoginDto login) {
		// TODO Auto-generated method stub
		return null;
	}

<<<<<<< HEAD
	@Override
	public String registerCustomer(CustomerDto customer) {
		// TODO Auto-generated method stub
		return null;
	}
=======
@Override
public String login(Login login) {
	// TODO Auto-generated method stub
	return null;
}
>>>>>>> branch 'Kanchan_Branch1' of https://github.com/JasminPanda/OnlineCustomerServiceCenter.git

	@Override
	public Response<IssueDto> viewIssueById(int issueId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response<IssueDto> reopenIssue(int issue) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response<List<IssueDto>> viewAllIssues() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String changePassword(LoginDto login) {
		// TODO Auto-generated method stub
		return null;
	}

<<<<<<< HEAD
	@Override
	public String forgetPassword(int password) {
		// TODO Auto-generated method stub
		return null;
	}
=======
@Override
public String changePassword(Login login) {
	// TODO Auto-generated method stub
	return null;
}
>>>>>>> branch 'Kanchan_Branch1' of https://github.com/JasminPanda/OnlineCustomerServiceCenter.git

<<<<<<< HEAD
	@Override
	public Response<CustomerDto> emailPassword(int email) {
		// TODO Auto-generated method stub
		return null;
	}

=======
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
>>>>>>> branch 'Kanchan_Branch1' of https://github.com/JasminPanda/OnlineCustomerServiceCenter.git

}

