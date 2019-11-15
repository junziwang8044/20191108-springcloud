package com.aaa.jun.controller;

import com.aaa.jun.model.User;
import com.aaa.jun.service.ISpringcloudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @作者：王君君
 * @项目：20191108-springcloud
 * @包：com.aaa.jun.controller
 * @日期：2019-11-12 20:02
 */
@RestController
public class UserController {

    @Autowired
    private ISpringcloudService springcloudService;

    @RequestMapping("/userAll")
    public List<User> selectAllUser(){
        return springcloudService.selectAllUser();
    }

}
