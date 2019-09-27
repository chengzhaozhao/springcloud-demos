package com.czz.springcloud.service;

import com.czz.springcloud.service.impl.HystrixErrorService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author chengzhzh@datangmobile.com
 * @create 2019-09-26 17:45
 */
@FeignClient(value = "service-client",fallback = HystrixErrorService.class)
public interface FeignSerive {

    @RequestMapping(value = "/eureka/test",method = RequestMethod.GET)
    public String feigntest(@RequestParam(value = "name") String name);
}
