package com.wolf.springbootdemo.mapper;

import com.wolf.springbootdemo.model.User;
import com.wolf.springbootdemo.model.UserExample;

public interface UserMapper {
    int countByExample(UserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}