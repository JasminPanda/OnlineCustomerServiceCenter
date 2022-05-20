package com.capgemini.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.model.entity.Customer;

public interface CustomerDao extends JpaRepository<Customer, Integer> {

}
