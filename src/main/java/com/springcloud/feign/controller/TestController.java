package com.springcloud.feign.controller;

import com.springcloud.feign.service.HelloFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: feign
 * @description:
 * @author: Mr.Wang
 * @create: 2021-06-16 14:05
 **/
@RestController
public class TestController {

    @Autowired
    HelloFeign helloFeign;

    @GetMapping("/hello")
    public String hi() {
        return this.helloFeign.hi();
    }
}
