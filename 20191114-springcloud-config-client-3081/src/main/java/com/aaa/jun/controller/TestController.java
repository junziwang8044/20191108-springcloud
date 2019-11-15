package com.aaa.jun.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @作者：王君君
 * @项目：20191108-springcloud
 * @包：com.aaa.jun.controller
 * @日期：2019-11-15 20:36
 */
@RestController
public class TestController {

    @Value("${server.port}")
    private String port;

    @Value("${spring.datasource.driver-class-name}")
    private String driverClassName;

    @Value("${mybatis.type-aliases-package}")
    private String mybatisTypePackage;

    @RequestMapping("/test")
    public String test(){
        return port+"-----"+driverClassName+"-----"+mybatisTypePackage;
    }

}
