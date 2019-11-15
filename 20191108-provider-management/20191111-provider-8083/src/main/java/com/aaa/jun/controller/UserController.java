package com.aaa.jun.controller;

import com.aaa.jun.model.User;
import com.aaa.jun.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @作者：王君君
 * @项目：20191108-springcloud
 * @包：com.aaa.jun.controller
 * @日期：2019-11-11 19:29
 */
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/userAll")
    public List<User> selectAllUser(){
        System.out.println("8083");
        return userService.selectAllUser();
    }

}
