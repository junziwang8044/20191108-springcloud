package com.aaa.jun.controller;

import com.aaa.jun.model.User;
import com.aaa.jun.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @作者：王君君
 * @项目：20191108-springcloud
 * @包：com.aaa.jun.controller
 * @日期：2019-11-12 21:38
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/userAll")
    public List<User> selectAllUser() throws Exception {
        List<User> users = userService.selectAllUser();
        if (users.size()>0){
            throw new Exception("模拟异常，测试熔断处理！");
        }
        return users;
    }

}
