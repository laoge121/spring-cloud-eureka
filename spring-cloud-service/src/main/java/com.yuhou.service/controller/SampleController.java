package com.yuhou.service.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 服务模型
 * Created by yuhou on 2016/11/23.
 */
@RestController
public class SampleController {
    private final static Logger logger = LoggerFactory.getLogger(SampleController.class);

    @Resource
    private DiscoveryClient discoveryClient;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add(@RequestParam Integer a, @RequestParam Integer b) {
        ServiceInstance serviceInstance = discoveryClient.getLocalServiceInstance();

        logger.info("/add,hosts" + serviceInstance.getHost() + ";;" + serviceInstance.getPort());

        return a + b + "";
    }
}
