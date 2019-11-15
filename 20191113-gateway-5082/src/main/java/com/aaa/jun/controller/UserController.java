package com.aaa.jun.controller;

import org.hibernate.validator.constraints.EAN;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @作者：王君君
 * @项目：20191108-springcloud
 * @包：com.aaa.jun.controller
 * @日期：2019-11-13 18:37
 */
@RestController
public class UserController {

    @RequestMapping("/userAll")
    public List<String> selectAllString(){
        ArrayList<String> strList = new ArrayList<>();
        String str ="王君君";
        strList.add(str);
        return strList;
    }

}
