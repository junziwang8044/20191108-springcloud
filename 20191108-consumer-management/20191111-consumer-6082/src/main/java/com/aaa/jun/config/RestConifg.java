package com.aaa.jun.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @作者：王君君
 * @项目：20191108-springcloud
 * @包：com.aaa.jun.config
 * @日期：2019-11-11 16:55
 */
@Configuration
public class RestConifg {

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

}
