package com.test.user.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.test.user.dao.UserDao;
import com.test.user.entity.User;
import com.test.user.service.UserService;

@Service("userService")
public class UserServerImpl implements UserService {

    @Resource
    private UserDao userDao;

    public User getUserById(User user) {

        return this.userDao.findUserById(user);
    }

	public List<User> findUser() {
		// TODO Auto-generated method stub
		return userDao.findUser();
	}

}