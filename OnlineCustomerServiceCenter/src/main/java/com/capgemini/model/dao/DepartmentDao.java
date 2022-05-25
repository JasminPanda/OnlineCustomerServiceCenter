package com.capgemini.model.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.model.entity.Department;

@Repository
public interface DepartmentDao extends JpaRepository<Department, Integer>{

		

}
