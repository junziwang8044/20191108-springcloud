package com.aaa.jun.fallback;

import com.aaa.jun.model.User;
import com.aaa.jun.service.ISpringcloudService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @作者：王君君
 * @项目：20191108-springcloud
 * @包：com.aaa.jun.fallback
 * @日期：2019-11-12 21:56
 */
@Component
public class ISpringcloudFallBackFactory implements FallbackFactory<ISpringcloudService> {

    @Override
    public ISpringcloudService create(Throwable throwable) {
        return new ISpringcloudService() {
            @Override
            public List<User> selectAllUser() {
                System.out.println("王君君");
                return null;
            }
        };
    }
}
