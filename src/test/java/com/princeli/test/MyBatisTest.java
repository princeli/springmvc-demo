package com.princeli.test;

import java.util.Date;
import java.util.UUID;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.princeli.model.User;
import com.princeli.service.UserService;

public class MyBatisTest {

    private UserService userService;
    
    /**
     * 这个before方法在所有的测试方法之前执行，并且只执行一次
     * 所有做Junit单元测试时一些初始化工作可以在这个方法里面进行
     * 比如在before方法里面初始化ApplicationContext和userService
     */
    @Before
    public void before(){
        //使用"spring.xml"和"spring-mybatis.xml"这两个配置文件创建Spring上下文
        ApplicationContext ac = new ClassPathXmlApplicationContext(new String[]{"spring/applicationContext.xml","spring/applicationContext-mybatis.xml"});
        //从Spring容器中根据bean的id取出我们要使用的userService对象
        userService = (UserService) ac.getBean("userService");
    }
    
    @Test
    public void testAddUser(){
        //ApplicationContext ac = new ClassPathXmlApplicationContext(new String[]{"spring.xml","spring-mybatis.xml"});
        //UserServiceI userService = (UserServiceI) ac.getBean("userService");
        User user = new User();
        user.setName("赵六");
        user.setPassword("123456");
        user.setBirthday(new Date());
        user.setSalary(10000D);
        userService.addUser(user);
    }
    
}