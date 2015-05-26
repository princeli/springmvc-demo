package com.princeli.controller;

import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.princeli.model.User;
import com.princeli.service.UserService;

@Controller
@RequestMapping(value = "/user")
public class UserController {
	
	@Autowired
	private UserService userService;

	@RequestMapping("/index")
	public String index(Model model) {
		List<User> lstUsers = userService.getAllUser();
		model.addAttribute("lstUsers", lstUsers);
		return "user/index";
	}
}
