package com.aaa.jun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @作者：王君君
 * @项目：20191108-springcloud
 * @包：com.aaa.jun
 * @日期：2019-11-10 21:59
 */
@SpringBootApplication
@EnableEurekaServer
public class ApplicationRun7083 {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun7083.class,args);
    }

}
