package com.wolf.springbootdemo.dao;

import com.wolf.springbootdemo.model.User;

import java.util.List;

public interface UserDao {


    List<User> selectAll();
}
