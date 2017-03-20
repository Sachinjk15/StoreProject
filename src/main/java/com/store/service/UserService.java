package com.store.service;

import com.store.model.User;
import com.store.model.UserWithRole;

public interface UserService {
	User save(User user);
	boolean findByLogin(String userEmail, String password);
	boolean findByUserName(String userEmail);
	UserWithRole findRoleOfUser(String email);
	
	void resetPassword(String userEmail, String userPassword);
	
	//check email is present registered or not
	boolean searchEmail(String email);
	
	
}
