package com.store.dao.impl;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.store.dao.UserDao;
import com.store.model.User;

public class UserDaoImpl implements UserDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public String findRoleOfUser(String userName) {
		
		// TODO Auto-generated method stub
		return null;
	}

	public User save(User user) {
		sessionFactory.openSession().save(user);
		return null;
	}

}
