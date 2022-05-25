package com.capgemini.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.model.entity.OperatorEntity;

@Repository
public interface OperatorDao extends JpaRepository<OperatorEntity, Integer>{
			OperatorEntity findByOperatorId(int operatorId);
}
