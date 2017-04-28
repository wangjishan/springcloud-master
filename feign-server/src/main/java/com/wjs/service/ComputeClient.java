package com.wjs.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 使用@FeignClient("provide-service")注解来绑定该接口对应compute-service服务
 * 通过Spring MVC的注解来配置provide-service服务下的具体实现。
 * <p>
 * Created by user on 2017/4/25.
 */
@Component
@FeignClient(value = "provide-service", fallback = ComputeClientHystrix.class)
public interface ComputeClient {


    @RequestMapping(method = RequestMethod.GET, value = "/add")
    Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b);

}
