package com.princeli.service;

import java.util.List;
import java.util.Map;

import com.princeli.model.Student;

 

public interface StudentService {
	/**
	 * 添加学生
	 * @param student
	 */
	void addStudent(Student student);
	
	/**
	 * 根据用户名和密码查询用户
	 * @param userName
	 * @param password
	 * @return
	 */
	boolean getStudentByLogin(String userName, String password);
	
	/**
	 * 通过用户名查询用户
	 * @param userName
	 * @return
	 */
	boolean getStudentByUserName(String userName);
	
	
    List<Student> getStudentList(Map map);
    
    int getStudentCount(Map map);
}
