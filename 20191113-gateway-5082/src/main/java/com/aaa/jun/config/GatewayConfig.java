package com.aaa.jun.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @作者：王君君
 * @项目：20191108-springcloud
 * @包：com.aaa.jun.config
 * @日期：2019-11-13 16:03
 */
@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator routeLocator(RouteLocatorBuilder routeLocatorBuilder) {
        return routeLocatorBuilder.routes()
                .route("baidu-route",
                        p ->p.path("/baidu")
                .filters(f ->f.addRequestHeader("name","junjun"))
                .uri("http://www.baidu.com")).build();

    }

}
