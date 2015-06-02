package com.princeli.dao;

import java.util.List;
import java.util.Map;

import com.princeli.model.Student;

public interface StudentMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
    
    Student getStudentByUserName(String userName);
    
    List<Student> getStudentList(Map map);
    
    int getStudentCount(Map map);
}