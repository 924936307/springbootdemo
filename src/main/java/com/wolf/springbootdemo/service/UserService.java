package com.wolf.springbootdemo.service;

import com.github.pagehelper.PageInfo;
import com.wolf.springbootdemo.model.User;

public interface UserService {

    User selectByPrimaryKey(int id);

    PageInfo<User> selectAll(int pageNum, int pageSize);


    void deleteByPrimaryKey(int id);

    void insertSelective(User user);

    void updateByPrimaryKeySelective(User user);

    User validateUser(String username, String password);
}
