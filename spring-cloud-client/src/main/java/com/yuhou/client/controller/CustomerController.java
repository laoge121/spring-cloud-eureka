package com.yuhou.client.controller;

import com.yuhou.client.service.CustomerService;
import com.yuhou.client.service.CustomerClientImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * Created by yuhou on 2016/11/23.
 */
@RestController
public class CustomerController {

    @Resource
    RestTemplate restTemplate;

    @Resource
    private CustomerService customerService;

    @Autowired
    @Qualifier("customerClient")
    private CustomerClientImpl customerClient;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add() {

        return restTemplate.getForEntity("http://YUHOU-SERVICE/add?a=11&b=22", String.class).getBody();

    }


    @RequestMapping(value = "/add2", method = RequestMethod.GET)
    public String add2() {

        return customerService.add(1, 2);
    }

    @RequestMapping(value = "/add3", method = RequestMethod.GET)
    public String add3() {

        return customerClient.add2();

    }
}
