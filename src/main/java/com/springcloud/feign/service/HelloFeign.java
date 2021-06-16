package com.springcloud.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "hello-microservice")
public interface HelloFeign {
    @RequestMapping("/hello")
    String hi();
}
