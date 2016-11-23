package com.yuhou.service;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 服务提供方
 * Created by yuhou on 2016/11/23.
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ApplicationService {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ApplicationService.class).web(true).run(args);
    }
}
