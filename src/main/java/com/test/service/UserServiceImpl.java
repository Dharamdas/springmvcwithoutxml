package com.test.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.UserDao;
import com.test.model.Login;
import com.test.model.User;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao dao;
	public void register(User user){
		dao.register(user);
	}
	public User validateUser(Login login){
		return dao.validateUser(login);
	}
	
	public List<User> getUserList(){
		return dao.getUserList();
	}
}
