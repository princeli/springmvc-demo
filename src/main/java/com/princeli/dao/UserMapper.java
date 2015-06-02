package com.princeli.dao;

import java.util.List;
import java.util.Map;

import com.princeli.model.Student;
import com.princeli.model.User;

public interface UserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
    List<User> getList(Map map);
    
    int getCount(Map map);

	User getUserByName(String name);
}