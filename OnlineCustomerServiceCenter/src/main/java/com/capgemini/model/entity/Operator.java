package com.capgemini.model.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Operator {
	@Id
	private int operatorId;
	private String firstName;
	private String lastName;
	private String email;
	private String mobile;
	private String city;
	
	
	
	
}
