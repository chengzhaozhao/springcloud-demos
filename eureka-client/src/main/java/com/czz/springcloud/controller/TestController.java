package com.czz.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chengzhzh@datangmobile.com
 * @create 2019-09-26 17:01
 */
@RestController
public class TestController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/eureka/test")
    public String eurekaClentTest(@RequestParam(value = "name",defaultValue = "czz") String name){
        return "hi " + name + ", i am from port: " + port;
    }
}
