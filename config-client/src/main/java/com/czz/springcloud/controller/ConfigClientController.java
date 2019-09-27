package com.czz.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chengzhzh@datangmobile.com
 * @create 2019-09-27 10:06
 */
@RestController
public class ConfigClientController {

    @Value("${foo}")
    private String foo;

    @RequestMapping("/getconfig")
    public String getInfoFromConfigClient(){
        return foo;
    }

}
