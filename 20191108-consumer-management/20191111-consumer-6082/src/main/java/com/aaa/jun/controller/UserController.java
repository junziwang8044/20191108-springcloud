package com.aaa.jun.controller;

import com.aaa.jun.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.awt.print.Book;
import java.util.List;

/**
 * @作者：王君君
 * @项目：20191108-springcloud
 * @包：com.aaa.jun.controller
 * @日期：2019-11-11 16:56
 */
@RestController
public class UserController {

    private static final String URL = "http://USER-PROVIDER/";

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @RequestMapping("/userAll")
    public List<User> selectAllBooks(){
        return restTemplate.getForObject(URL+"userAll",List.class);
    }

    @RequestMapping("/allLB")
    public List<Book> selectUsersByLoadBalance(){
        //1.通过loadBalancerClient对象获取到所有的服务提供者的信息
            // application.properties配置文件中book-provider.ribbon.listOfServers=localhost:8081,localhost:8082,localhost:8083
            // 通过8081，8082，8083中spring.application.name获取到
            // serviceId--->key(choose(Object key))
            // key--->spring.application.name的值
            // serviceInstance:每一个Server对象
        ServiceInstance serviceInstance = loadBalancerClient.choose("user-provider");
        //2.获取server的IP地址
        String host = serviceInstance.getHost();
        System.out.println(host);
        //3.获取server的port
        int port = serviceInstance.getPort();
        //ip+port+requestMappering路径
        return restTemplate.getForObject("http://"+host+":"+port+"/all",List.class);
    }

}
