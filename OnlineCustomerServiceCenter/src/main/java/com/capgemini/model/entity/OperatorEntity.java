package com.capgemini.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Entity
@NoArgsConstructor
@ToString
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
	public void setOperatorID(Object getOperatorId) {
		// TODO Auto-generated method stub
		
	}
	public void setFirstName(Object getFirstName) {
		// TODO Auto-generated method stub
		
	}
	public void setLastName(Object getLastName) {
		// TODO Auto-generated method stub
		
	}
	public void setEmail(Object getEmail) {
		// TODO Auto-generated method stub
		
	}
	public void setMobile(Object getMobile) {
		// TODO Auto-generated method stub
		
	}
	public void setCity(Object getCity) {
		// TODO Auto-generated method stub
		
	}
	public Object getOperatorId() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getFirstName() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getLastName() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getEmail() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getMobile() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getCity() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
