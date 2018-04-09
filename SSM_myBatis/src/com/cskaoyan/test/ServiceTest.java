package com.cskaoyan.test;

import com.cskaoyan.bean.User;
import com.cskaoyan.service.UserService;
import com.cskaoyan.service.impl.UserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;

//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class ServiceTest {


   @Autowired
    UserService userService;

//
//    @Test
//    public void test1() throws IOException {
//
//        User userById = userService.getUserById(3);
//        System.out.println("userById=" + userById);
//
//    }

    @Test
    public void test3() throws IOException {

        User userById = userService.getUserById(5);

    }

}
