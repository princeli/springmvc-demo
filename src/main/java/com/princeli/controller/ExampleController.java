package com.princeli.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping(value = "/example")
public class ExampleController {

	@RequestMapping(value="/index", method=RequestMethod.GET)
	public String index(Model model) {
		return "example/index";
	}
	
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String login(Model model) {
		return "example/login";
	}
	
	@RequestMapping(value="/flot", method=RequestMethod.GET)
	public String flot(Model model) {
		return "example/flot";
	}
}
