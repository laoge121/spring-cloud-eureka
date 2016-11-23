package com.yuhou.client.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by yuhou on 2016/11/23.
 */
@FeignClient(value = "YUHOU-SERVICE", fallback = CustomerServiceImpl.class)
public interface CustomerService {

    @RequestMapping(method = RequestMethod.GET, value = "/add")
    public String add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b);
}
