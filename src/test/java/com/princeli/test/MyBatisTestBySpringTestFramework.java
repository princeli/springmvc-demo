package com.princeli.test;

import java.util.Date;
import java.util.UUID;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.princeli.model.User;
import com.princeli.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
//配置了@ContextConfiguration注解并使用该注解的locations属性指明spring和配置文件之后，
@ContextConfiguration(locations = {"classpath:spring/applicationContext.xml", "classpath:spring/applicationContext-mybatis.xml" })
public class MyBatisTestBySpringTestFramework {

    //注入userService
    @Autowired
    private UserService userService;
    
    @Test
    public void testAddUser(){
        User user = new User();
        user.setUserId(UUID.randomUUID().toString().replaceAll("-", ""));
        user.setUserName("xdp_gacl_白虎神皇");
        user.setUserBirthday(new Date());
        user.setUserSalary(10000D);
        userService.addUser(user);
    }
    
    @Test
    public void testGetUserById(){
        String userId = "fd7128d0f0854806af8d0d3d02f80235";
        User user = userService.getUserById(userId);
        System.out.println(user.getUserName());
    }
}