package com.czz.springcloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author chengzhzh@datangmobile.com
 * @create 2019-09-26 17:20
 */
@Service
public class RestRibbonService {
    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hystrixError")
    public String restRibbonServiceTest(String name){
       return restTemplate.getForObject("http://EUREKA-CLIENT-EXAMPLE/eureka/test?name="+name,String.class);
    }

    public String hystrixError(String name){
        return "hi," + name + ", sorry error";
    }
}
