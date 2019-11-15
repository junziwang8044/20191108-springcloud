package com.aaa.jun.config;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @作者：王君君
 * @项目：20191108-springcloud
 * @包：com.aaa.jun.config
 * @日期：2019-11-08 20:55
 */
@SpringBootApplication
public class ConfigRest {

    @Bean
    public RestTemplate getRestTmplate(){
        return new RestTemplate();
    }

}
