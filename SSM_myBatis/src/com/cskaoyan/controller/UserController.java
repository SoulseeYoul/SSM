package com.cskaoyan.controller;

import com.cskaoyan.bean.User;
import com.cskaoyan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;


@Controller
public class UserController {


    @Autowired
    UserService userService;

    @Transactional
    @RequestMapping("/findUserById")
    public String findUserById(int id , Model model) throws IOException {

        User user = userService.getUserById(id);

        System.out.println("user=" + user);

        model.addAttribute("user",user);

        return "/index.jsp";

    }
}
