package com.capgemini.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.model.entity.CustomerEntity;

public interface CustomerDao extends JpaRepository<CustomerEntity, Integer> {

}
