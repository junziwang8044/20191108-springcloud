package com.aaa.jun;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @作者：王君君
 * @项目：20191108-springcloud
 * @包：com.aaa.jun
 * @日期：2019-11-11 19:26
 */
@SpringBootApplication
@MapperScan("com.aaa.jun.mapper")
@EnableDiscoveryClient
public class ApplicationRun8083 {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun8083.class,args);
    }

}
