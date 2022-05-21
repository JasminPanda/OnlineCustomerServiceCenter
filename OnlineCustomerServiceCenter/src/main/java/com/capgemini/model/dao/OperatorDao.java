package com.capgemini.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.model.entity.OperatorEntity;

public interface OperatorDao extends JpaRepository<OperatorEntity, Integer>{
			OperatorEntity findByOperatorName(String operatorName);
}
