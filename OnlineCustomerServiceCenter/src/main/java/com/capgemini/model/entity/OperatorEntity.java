package com.capgemini.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@Table(name = "operator")
public class OperatorEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name= "operatorId")
	private int operatorId;
	@Column(name = "firstName")
	private String firstName;
	@Column(name = "lastName")
	private String lastName;
	@Column(name = "email")
	private String email;
	@Column(name = "mobile")
	private String mobile;
	@Column(name = "city")
	private String city;
	
	
}