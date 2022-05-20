package com.capgemini.model.dto;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
public class LoginDto {
	@Id
	@Column
    private int username;
	@Column
    private String password;
	@Column
    private String UserType;
	@Column
    private boolean isActive;
	
	public LoginDto() {
		super();
	}
	
	public LoginDto(int username, String password, String UserType, boolean isActive) {
		super();
		this.username = username;
		this.password = password;
		this.UserType = UserType;
		this.isActive = isActive;
		
	}

	@Override
	public String toString() {
		return "Login [username=" + username + ", password=" + password + ", UserType=" + UserType + ", isActive="
				+ isActive + "]";
	}

	public int getUsername() {
		return username;
	}

	public void setUsername(int username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserType() {
		return UserType;
	}

	public void setUserType(String userType) {
		UserType = userType;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
}



