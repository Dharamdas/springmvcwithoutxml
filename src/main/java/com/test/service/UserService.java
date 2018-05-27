package com.test.service;

import java.util.List;

import com.test.model.Login;
import com.test.model.User;

public interface UserService {
	public void register(User user);
	public User validateUser(Login login);
	public List<User> getUserList();

}
