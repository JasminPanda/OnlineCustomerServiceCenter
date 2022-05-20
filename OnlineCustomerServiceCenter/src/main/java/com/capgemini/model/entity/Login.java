package com.capgemini.model.entity;

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

public class Login {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
     private int username;
	@Column
     private String password;
	@Column
     private String UserType;
	@Column
     private boolean isActive;
	
	public Login() {
		super();
	}
}


