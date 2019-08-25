package com.wolf.springbootdemo.mapper;

import com.wolf.springbootdemo.model.User;
import com.wolf.springbootdemo.model.UserExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    @Select("Select * from user")
    List<User> selectAll();

    @Select("Select * from user where username = #{username} and password = #{password}")
    User selectByUsernamePass(@Param("username") String username, @Param("password") String password);

    @Select("Select * from user where username = #{username}")
    User selectByUsername(@Param("username") String username);

    int countByExample(UserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}