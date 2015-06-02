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
	
	@RequestMapping(value="/flot", method=RequestMethod.GET)
	public String flot(Model model) {
		return "example/flot";
	}
	
	@RequestMapping(value="/morris", method=RequestMethod.GET)
	public String morris(Model model) {
		return "example/morris";
	}
	
	@RequestMapping(value="/tables", method=RequestMethod.GET)
	public String tables(Model model) {
		return "example/tables";
	}
	
	@RequestMapping(value="/forms", method=RequestMethod.GET)
	public String forms(Model model) {
		return "example/forms";
	}
	
	@RequestMapping(value="/panels-wells", method=RequestMethod.GET)
	public String panelswells(Model model) {
		return "example/panels-wells";
	}
	
	@RequestMapping(value="/buttons", method=RequestMethod.GET)
	public String buttons(Model model) {
		return "example/buttons";
	}
	
	@RequestMapping(value="/notifications", method=RequestMethod.GET)
	public String notifications(Model model) {
		return "example/notifications";
	}
	
	@RequestMapping(value="/typography", method=RequestMethod.GET)
	public String typography(Model model) {
		return "example/typography";
	}
	
	@RequestMapping(value="/icons", method=RequestMethod.GET)
	public String icons(Model model) {
		return "example/icons";
	}
	
	@RequestMapping(value="/grid", method=RequestMethod.GET)
	public String grid(Model model) {
		return "example/grid";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String login(Model model) {
		return "example/login";
	}
	
	@RequestMapping(value="/blank", method=RequestMethod.GET)
	public String blank(Model model) {
		return "example/blank";
	}
}
