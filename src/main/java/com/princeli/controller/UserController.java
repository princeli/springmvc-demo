package com.princeli.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.princeli.model.User;
import com.princeli.service.UserService;
import com.princeli.vo.StudentLogin;


@Controller

@RequestMapping(value = "/user")
public class UserController {
	
	@Autowired
	private UserService userService;

	@RequestMapping(value="/index", method=RequestMethod.GET)
	public String index(Model model) {
		//List<User> lstUsers = userService.getAllUser();
		//model.addAttribute("lstUsers", lstUsers);
		return "user/index";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String toLogin(User user,Model model) {
		//User user = new User();
		//model.addAttribute("User", user);
		return "user/login";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(@ModelAttribute("user") User user,BindException errors) {
		System.out.println("-----"+user.getName()+user.getPassword());
		boolean found = userService.getUserByLogin(user.getName(), user.getPassword());
		if (found) {				
			return "user/index";
		} else {	
			errors.reject("ccc", "用户名或密码有误！");   
            errors.rejectValue("name", "nameErr", null, "用户名错误");   
            errors.rejectValue("password", "passErr", null, "密码错误");   
			return "user/login";
		}
		
	}
 
}
