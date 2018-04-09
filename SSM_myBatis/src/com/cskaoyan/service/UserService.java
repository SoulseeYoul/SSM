package com.cskaoyan.service;

import com.cskaoyan.bean.User;

import java.io.IOException;

public interface UserService {

         User   login(User user);

         int register(User user);

         boolean isUsernameExist(String username);

         User getUserById(int id) throws IOException;
}
