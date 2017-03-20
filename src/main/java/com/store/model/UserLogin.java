package com.store.model;

import org.hibernate.validator.constraints.NotEmpty;

public class UserLogin {

	
	@NotEmpty
	private String userName;
		
	@NotEmpty
	private String password;
	
	@NotEmpty
	private String email;
	
	private String userRole;

	public String getPassword() {
		return password;
	}

	public String getUserName() {
		return userName;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	
}
