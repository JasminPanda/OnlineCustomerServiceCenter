package com.capgemini.model.dto;


public class LoginDto {

    private int username;
    private String password;
    private String UserType;
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

	@Override
	public String toString() {
		return "LoginDto [username=" + username + ", password=" + password + ", UserType=" + UserType + ", isActive="
				+ isActive + "]";
	}

	
	
	
}



