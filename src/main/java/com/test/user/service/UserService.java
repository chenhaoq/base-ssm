package com.test.user.service;

import java.util.List;

import com.test.user.entity.User;

public interface UserService {
	
	public User getUserById(User user); 
	
	List<User> findUser();

}
