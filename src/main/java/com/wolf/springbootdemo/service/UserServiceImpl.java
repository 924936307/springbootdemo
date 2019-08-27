package com.wolf.springbootdemo.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wolf.springbootdemo.mapper.UserMapper;
import com.wolf.springbootdemo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User selectByPrimaryKey(int id) {
        return null;
    }

    @Override
    public PageInfo<User> selectAll(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<User> users = userMapper.selectAll();
        PageInfo<User> pageInfo = new PageInfo<>(users);
        return pageInfo;
    }


    @Override
    public void deleteByPrimaryKey(int id) {

    }

    @Override
    public void insertSelective(User user) {

    }

    @Override
    public void updateByPrimaryKeySelective(User user) {

    }

    @Override
    public User validateUser(String username, String password) {
        return userMapper.selectByUsernamePass(username,password);
    }
}
