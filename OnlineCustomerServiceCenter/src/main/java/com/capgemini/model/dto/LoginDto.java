package com.capgemini.model.dto;


<<<<<<< HEAD
=======
import org.hibernate.usertype.UserType;

@Table
>>>>>>> branch 'Kanchan_Branch1' of https://github.com/JasminPanda/OnlineCustomerServiceCenter.git
public class LoginDto {

    private int username;
    private String password;
<<<<<<< HEAD
    private String UserType;
=======
	@Column
    private UserType type;;
	@Column
>>>>>>> branch 'Kanchan_Branch1' of https://github.com/JasminPanda/OnlineCustomerServiceCenter.git
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

<<<<<<< HEAD
=======
	@Override
	public String toString() {
		return "Login [username=" + username + ", password=" + password + ", UserType=" + type + ", isActive="
				+ isActive + "]";
	}

>>>>>>> branch 'Kanchan_Branch1' of https://github.com/JasminPanda/OnlineCustomerServiceCenter.git
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

	@Override
	public String toString() {
		return "LoginDto [username=" + username + ", password=" + password + ", UserType=" + UserType + ", isActive="
				+ isActive + "]";
	}

	
	
	
}



