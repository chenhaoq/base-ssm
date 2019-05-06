package com.test.user.dao;

import java.util.List;

import com.test.user.entity.User;

public interface UserDao {
	
	User findUserById(User user);
	
	List<User> findUser(); 

}
