package com.wolf.springbootdemo.dao;

import com.wolf.springbootdemo.model.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserDaoImpl implements UserDao{



    @Override
    public List<User> selectAll() {
        return null;
    }
}
