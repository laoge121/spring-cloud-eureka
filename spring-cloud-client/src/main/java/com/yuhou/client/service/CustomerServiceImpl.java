package com.yuhou.client.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by yuhou on 2016/11/23.
 */
@Component
public class CustomerServiceImpl implements CustomerService {
    @Override
    public String add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b) {
        return "error";
    }
}
