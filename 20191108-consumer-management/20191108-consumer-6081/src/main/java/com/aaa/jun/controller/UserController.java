package com.aaa.jun.controller;

import com.aaa.jun.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @作者：王君君
 * @项目：20191108-springcloud
 * @包：com.aaa.jun.controller
 * @日期：2019-11-08 20:53
 */
@RestController
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/userAll")
    public List<User> selectAllUsers(){
        return restTemplate.getForObject("http://localhost:8081/userAll",List.class);
    }

}
