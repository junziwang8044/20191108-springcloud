package com.aaa.jun.service;



import com.aaa.jun.mapper.UserMapper;
import com.aaa.jun.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @作者：王君君
 * @项目：20191024-dubbo-provider
 * @包：com.aaa.jun.dubbo
 * @日期：2019-10-24 15:34
 */
@Service
public class UserService{

    @Autowired
    private UserMapper userMapper;

    public List<User> selectAllUser()
    {
        return userMapper.selectAll();
    }
}
