package com.test.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.user.entity.User;
import com.test.user.service.UserService;
@Controller
@RequestMapping("/")
public class LoginController {

	@Autowired
	private UserService UserService;
	
	@RequestMapping("/index")
	public String test(){
		
		List<User> list = UserService.findUser();
		for (User User : list) {
			System.out.println(User);
		}
		return "index";
	}

		
}
