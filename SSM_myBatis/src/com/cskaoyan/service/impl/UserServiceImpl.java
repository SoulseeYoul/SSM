package com.cskaoyan.service.impl;

import com.cskaoyan.bean.User;
import com.cskaoyan.dao.UserMapper;
import com.cskaoyan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;


@Service
public class UserServiceImpl implements UserService {


    @Autowired
    UserMapper dao ;


    @Override
    public User login(User user) {
        return null;
    }

    @Override
    public int register(User user) {
        return 0;
    }

    @Override
    public boolean isUsernameExist(String username) {


        return false;
    }

    @Override
    public User getUserById(int id) throws IOException {
        return dao.queryUserByPrimaryKey(id);
    }


}
