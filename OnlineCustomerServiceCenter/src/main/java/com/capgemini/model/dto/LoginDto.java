package com.capgemini.model.dto;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.usertype.UserType;

@Table
public class LoginDto {
	@Id
	@Column
    private int username;
	@Column
    private String password;
	@Column
    private UserType type;;
	@Column
    private boolean isActive;
	
	public LoginDto() {
		super();
	}
	
	public LoginDto(int username, String password, UserType type, boolean isActive) {
		super();
		this.username = username;
		this.password = password;
		this.type = type;
		this.isActive = isActive;
		
	}

	@Override
	public String toString() {
		return "Login [username=" + username + ", password=" + password + ", UserType=" + type + ", isActive="
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

	public UserType getUserType() {
		return type;
	}

	public void setUserType(String userType) {
		this.type = type;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
}



