package com.test.dao;

import java.util.List;

import com.test.model.Login;
import com.test.model.User;



public interface UserDao {
	
	public void register(User user);
	 public  User validateUser(Login login);
	 public List<User> getUserList();

}

