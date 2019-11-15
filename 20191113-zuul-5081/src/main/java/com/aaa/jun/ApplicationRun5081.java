package com.aaa.jun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @作者：王君君
 * @项目：20191108-springcloud
 * @包：com.aaa.jun
 * @日期：2019-11-13 15:24
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class ApplicationRun5081 {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun5081.class,args);
    }

}
