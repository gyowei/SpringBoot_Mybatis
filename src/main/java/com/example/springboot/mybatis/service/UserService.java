package com.example.springboot.mybatis.service;

import com.example.springboot.mybatis.model.User;

import java.util.List;

/**
 * @author phil
 * @create 2021-04-21 12:11
 */
public interface UserService {

    User queryUserById(Integer id);

    int insertSelective(User user);

    int deleteByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User user);

    List<User> selectAll();
}
