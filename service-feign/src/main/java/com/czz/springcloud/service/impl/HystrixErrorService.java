package com.czz.springcloud.service.impl;

import com.czz.springcloud.service.FeignSerive;
import org.springframework.stereotype.Component;

/**
 * @author chengzhzh@datangmobile.com
 * @create 2019-09-27 8:22
 */
@Component
public class HystrixErrorService implements FeignSerive {
    @Override
    public String feigntest(String name) {
        return "sorry" +name;
    }
}
