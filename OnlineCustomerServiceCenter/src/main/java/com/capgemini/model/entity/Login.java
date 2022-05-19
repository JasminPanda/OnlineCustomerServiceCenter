package com.capgemini.model.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Login {
	@Id
	private String firstName;
	private String lastName;
	private int username;
	private String password;
	private boolean status;
	private String userStatus;
	
}
