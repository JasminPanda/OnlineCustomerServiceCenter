package com.capgemini.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.model.entity.Customer;

@Repository
public interface CustomerDao extends JpaRepository<Customer, Integer> {
	

}
