package com.aaa.jun;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @作者：王君君
 * @项目：20191108-springcloud
 * @包：com.aaa.jun
 * @日期：2019-11-11 18:30
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.aaa.jun.mapper")
public class ApplicationRun8082 {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun8082.class,args);
    }

}
