package com.yuhou.client.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * Created by yuhou on 2016/11/23.
 */
@Service("customerClient")
public class CustomerClientImpl {

    @Resource
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "addHystrix")
    public String add2() {
        return restTemplate.getForEntity("http://YUHOU-SERVICE/add?a=11&b=2", String.class).getBody();
    }

    public String addHystrix() {
        return "error";
    }

}
