package com.easy.user.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.easy.user.dao.UserDao;
import com.easy.user.entity.User;
import com.easy.user.service.UserService;

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