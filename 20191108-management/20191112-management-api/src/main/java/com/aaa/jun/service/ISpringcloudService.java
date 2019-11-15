package com.aaa.jun.service;

import com.aaa.jun.fallback.ISpringcloudFallBackFactory;
import com.aaa.jun.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @作者：王君君
 * @项目：20191108-springcloud
 * @包：com.aaa.jun.service
 * @日期：2019-11-12 20:04
 */
@FeignClient(value = "USER-PROVIDER",fallbackFactory = ISpringcloudFallBackFactory.class)
public interface ISpringcloudService {

    @RequestMapping("/userAll")
    List<User> selectAllUser();

}
