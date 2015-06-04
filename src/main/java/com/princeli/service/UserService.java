package com.princeli.service;

import java.util.List;
import java.util.Map;

import com.princeli.model.User;

public interface UserService {
    /**
     * 添加用户
     * @param user
     */
    void addUser(User user);
    
    /**
     * 根据用户id获取用户
     * @param userId
     * @return
     */
    User getUserById(Long userId);
    
    /**
     * 根据条件查询list
     * @param map
     * @return
     */
    List<User> getList(Map map);
    
    /**
     * 根据条件查询数目
     * @param map
     * @return
     */
    int getCount(Map map);
    
	/**
	 * 根据用户名和密码查询用户
	 * @param name
	 * @param password
	 * @return
	 */
	boolean getUserByLogin(String name, String password);
	
	/**
	 * 通过用户名查询用户
	 * @param userName
	 * @return
	 */
	boolean getUserByName(String name);
    
 
}
