package com.capgemini.model.entity;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table

public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
     private int deptId;
	@Column
     private String deptName;
	
	public Department() {
		super();
	}

}
