package com.princeli.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.princeli.model.User;
import com.princeli.service.UserService;





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
		return "user/login";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(@Valid @ModelAttribute("user") User user,BindingResult result) {
		// 如果有数据校验错误，返回添加用户的页面  
	    if (result.hasErrors()) {  
	        return "user/login";  
	    }  
		
		System.out.println("-----"+user.getName()+":"+user.getPassword()+"------");
		
		boolean exists = userService.getUserByName(user.getName());
		
		if(!exists){
			result.rejectValue("name", "该用户不存在", "该用户不存在"); 
			return "user/login";
		}
		
		
		boolean found = userService.getUserByLogin(user.getName(), user.getPassword());
		if (found) {				
			return "redirect:/user/index.html";
		} else {	
			result.rejectValue("", "用户名或密码错误", "用户名或密码错误"); 

			return "user/login";
		}
		
	}
	
	@RequestMapping(value="/list")
	public String list(Model model) {
		return "user/list";
	}
	
	@RequestMapping(value="list.json")  
	@ResponseBody
	public Map<String, Object> listJson() {  
	  List<User> list = userService.getAllList();
	  if (list != null) {  
	    Map<String, Object> result = new HashMap<String, Object>();  
	    //result.put("total", list.size());  
	    result.put("data", list);  
	    return result;  
	  }  
	  return null;  
	}
 
}
