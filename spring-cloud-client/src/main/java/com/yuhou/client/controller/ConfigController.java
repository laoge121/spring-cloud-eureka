package com.yuhou.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yuhou on 2016/11/23.
 */
@RestController
@RefreshScope
public class ConfigController {

    @Value("${from}")
    private String from;

    @RequestMapping("/config")
    public String testConfig() {
        return from.toString();
    }
}
