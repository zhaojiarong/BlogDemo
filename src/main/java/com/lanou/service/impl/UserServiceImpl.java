package com.lanou.service.impl;

import com.lanou.bean.UserBean;
import com.lanou.mapper.UserMapper;
import com.lanou.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by dllo on 18/2/26.
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public List<UserBean> getall() {
        return userMapper.getall();
    }

    @Override
    public UserBean findUser(String name, String password) {
        return userMapper.findUser(name,password);
    }

    @Override
    public Integer insertUser(String name, String password) {
        return userMapper.insertUser(name,password);
    }
}
