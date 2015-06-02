package com.princeli.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.princeli.model.Student;
import com.princeli.service.StudentService;
import com.princeli.vo.StudentLogin;
 

@Controller
@SessionAttributes("student")
@RequestMapping(value = "/student")
public class StudentController extends BaseController{  
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping(value="/index")
	public String index(Model model) {
		return "student/index";
	}
	
	@RequestMapping(value="/signup", method=RequestMethod.GET)
	public String signup(Model model) {
		Student student = new Student();
		model.addAttribute("student", student);
		return "student/signup";
	}
	
	@RequestMapping(value="/signup", method=RequestMethod.POST)
	public String signup(@ModelAttribute("student") Student student, Model model) {
		if(studentService.getStudentByUserName(student.getUsername())) {
			model.addAttribute("message", "User Name exists. Try another user name");
			return "student/signup";
		} else {
			studentService.addStudent(student);
			model.addAttribute("message", "Saved student details");
			return "redirect:login.html";
		}
	}
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String login(Model model) {
		StudentLogin studentLogin = new StudentLogin();
		model.addAttribute("studentLogin", studentLogin);
		return "student/login";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(@ModelAttribute("studentLogin") StudentLogin studentLogin) {
		boolean found = studentService.getStudentByLogin(studentLogin.getUsername(), studentLogin.getPassword());
		if (found) {				
			return "student/success";
		} else {				
			return "student/failure";
		}
	}
	
	
	 @RequestMapping("/list")  
	    public String test(Model model, @RequestParam(required=false) String userName, @RequestParam(required=false) Integer pageNum,   
	            @RequestParam(required=false) Integer pageSize) {     
	          
	        Map<String,Object> map = new HashMap<String,Object>();  
	        map.put("userName", userName);  
	        Integer totalCount = studentService.getStudentCount(map);
	          
	        initPage(map, pageNum, pageSize, totalCount);  
	          
	        List list = studentService.getStudentList(map); 
	        this.initResult(model, list, map);  
	          
	        return "student/list";  
	    }  
}
