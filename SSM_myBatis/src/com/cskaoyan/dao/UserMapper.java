package com.cskaoyan.dao;


import com.cskaoyan.bean.User;

import java.io.IOException;

public interface UserMapper {


    public User queryUserByPrimaryKey(int id) throws IOException;

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User getUserById(int id) throws IOException;


}
