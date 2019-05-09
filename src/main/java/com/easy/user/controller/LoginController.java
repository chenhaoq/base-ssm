package com.easy.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.easy.user.entity.User;
import com.easy.user.service.UserService;
@Controller
@RequestMapping("/")
public class LoginController {

	@Autowired
	private UserService UserService;
	
	@RequestMapping("/index")
	public String easy(){
		
		List<User> list = UserService.findUser();
		for (User User : list) {
			System.out.println(User);
		}
		return "index";
	}

		
}
