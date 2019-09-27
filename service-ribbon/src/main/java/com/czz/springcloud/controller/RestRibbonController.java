package com.czz.springcloud.controller;

import com.czz.springcloud.service.RestRibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chengzhzh@datangmobile.com
 * @create 2019-09-26 17:24
 */
@RestController
public class RestRibbonController {
    @Autowired
    private RestRibbonService restRibbonService;

    @GetMapping("/ribbon/test")
    public String restRibbonServiceTest(@RequestParam String name){
        return restRibbonService.restRibbonServiceTest(name);
    }
}
