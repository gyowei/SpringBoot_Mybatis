package com.example.springboot.mybatis.service.impl;

import com.example.springboot.mybatis.mapper.UserMapper;
import com.example.springboot.mybatis.model.User;
import com.example.springboot.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author phil
 * @create 2021-04-21 12:12
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User queryUserById(Integer id) {

        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public int insertSelective(User user) {
        int result = userMapper.insertSelective(user);
        return result;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        int result = userMapper.deleteByPrimaryKey(id);
        return result;
    }

    @Transactional
    @Override
    public int updateByPrimaryKeySelective(User user) {
        int result = userMapper.updateByPrimaryKeySelective(user);
//        int a=10/0;
        return result;
    }

    @Override
    public List<User> selectAll() {
        return userMapper.selectAll();
    }
}
