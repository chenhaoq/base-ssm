package com.easy.user.dao;

import java.util.List;

import com.easy.user.entity.User;

public interface UserDao {
	
	User findUserById(User user);
	
	List<User> findUser(); 

}
