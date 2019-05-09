package com.easy.user.service;

import java.util.List;

import com.easy.user.entity.User;

public interface UserService {
	
	public User getUserById(User user); 
	
	List<User> findUser();

}
