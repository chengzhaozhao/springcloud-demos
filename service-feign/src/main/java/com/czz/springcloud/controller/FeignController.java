package com.czz.springcloud.controller;

import com.czz.springcloud.service.FeignSerive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chengzhzh@datangmobile.com
 * @create 2019-09-26 17:49
 */
@RestController
public class FeignController {
    /**
     * 编辑器报错
     */
    @Autowired
    private FeignSerive feignSerive;

    @GetMapping(value = "/feign")
    public String feignTest(@RequestParam(value = "name") String name){
        return feignSerive.feigntest(name);
    }
}
