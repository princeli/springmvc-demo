package com.princeli.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.princeli.dao.UserMapper;
import com.princeli.model.Student;
import com.princeli.model.User;
import com.princeli.service.UserService;
 

/**
 * @author ly
 * 使用@Service注解将UserServiceImpl类标注为一个service
 * service的id是userService
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    /**
     * 使用@Autowired注解标注userMapper变量，
     * 当需要使用UserMapper时，Spring就会自动注入UserMapper
     */
    @Autowired
    private UserMapper userMapper;//注入dao

    @Override
    public void addUser(User user) {
        userMapper.insert(user);
    }

    @Override
    public User getUserById(Long userId) {
        return userMapper.selectByPrimaryKey(userId);
    }

	@Override
	public List<User> getList(Map map) {
		return userMapper.getList(map);
	}

	@Override
	public int getCount(Map map) {
		return userMapper.getCount(map);
	}

	@Override
	public boolean getUserByLogin(String name, String password) {
		User user = userMapper.getUserByName(name);
		
		if(user != null && user.getPassword().equals(password)) {
			return true;
		}
		
		return false;
	}
    
 
}