package com.capgemini.model.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.model.dto.IssueDto;
import com.capgemini.model.dto.LoginDto;
import com.capgemini.model.entity.Customer;

@Repository
public interface CustomerDao extends JpaRepository<Customer, Integer> {
<<<<<<< HEAD
	
=======
	public String login(LoginDto login);
	public String createCustomer(Customer customer);
	public IssueDto readIssueById(int issueId);
	public List<IssueDto> readAllIssues();
	public String changePassword(LoginDto login);
	public String forgetPassword(int username);
>>>>>>> branch 'Kanchan_Branch1' of https://github.com/JasminPanda/OnlineCustomerServiceCenter.git

}
