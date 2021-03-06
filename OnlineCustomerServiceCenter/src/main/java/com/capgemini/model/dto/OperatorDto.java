package com.capgemini.model.dto;

import com.capgemini.model.entity.OperatorEntity;

public class OperatorDto {
	private int operatorId;
	private String firstName;
	private String lastName;
	private String email;
	private String mobile;
	private String city;
	public Object getOperatorId;
	public Object getFirstName;
	public Object getLastName;
	public Object getEmail;
	public Object getMobile;
	public Object getCity;
	
	public OperatorDto() {
		
	}
	
	public int getOperatorId() {
		return operatorId;
	}
	public void setOperatorId(int operatorId) {
		this.operatorId = operatorId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "Operator [operatorId=" + operatorId + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", mobile=" + mobile + ", city=" + city + "]";
	}

	public static void save(OperatorEntity entity) {
		// TODO Auto-generated method stub
		
	}
}
