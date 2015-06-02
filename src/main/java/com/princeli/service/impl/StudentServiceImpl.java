package com.princeli.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.princeli.dao.StudentMapper;
import com.princeli.model.Student;
import com.princeli.service.StudentService;

 

@Service("studentService")
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentMapper studentMapper;
	
 
	public void addStudent(Student student) {
		studentMapper.insert(student);
	}

	public boolean getStudentByLogin(String userName, String password) {
		Student student = studentMapper.getStudentByUserName(userName);
		
		if(student != null && student.getPassword().equals(password)) {
			return true;
		}
		
		return false;
	}

	public boolean getStudentByUserName(String userName) {
		Student student = studentMapper.getStudentByUserName(userName);
		
		if(student != null) {
			return true;
		}
		
		return false;
	}
	
	public List<Student> getStudentList(Map map){
    	return studentMapper.getStudentList(map);
    }
    
	public int getStudentCount(Map map){
    	return studentMapper.getStudentCount(map);
    }

 

}
