package com.store.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.store.model.User;
import com.store.model.UserWithRole;
import com.store.service.UserService;
import com.store.user.repository.UserRepository;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Transactional
	public User save(User user) {
		return userRepository.save(user);
	}

	public boolean findByLogin( String userEmail,String password) {	
		User user = userRepository.findByUserName(userEmail);
		
		if(user != null && user.getPassword().equals(password)) {
			return true;
		} 
		
		return false;		
	}

	public boolean findByUserName(String userEmail) {
		User user = userRepository.findByUserName(userEmail);
		
		if(user != null) {
			return true;
		}
		
		return false;
	}

	

	public UserWithRole findRoleOfUser(String email) {
		UserWithRole userrl = userRepository.findRoleOfUser(email);
		return userrl;
	}

	
	public void resetPassword(String userEmail, String userPassword) {
		userRepository.resetPassword(userEmail,userPassword);
		
	}

	public boolean searchEmail(String email) {
		
		User user=userRepository.searchEmail(email);
		if(user != null) {
			return true;
		}
		return false;
	}
	

	
}
