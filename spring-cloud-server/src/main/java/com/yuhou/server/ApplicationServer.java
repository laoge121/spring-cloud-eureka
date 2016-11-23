package com.yuhou.server;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 服务注册中心
 * Created by yuhou on 2016/11/23.
 */
@EnableEurekaServer
@SpringBootApplication
public class ApplicationServer {
    public static void main(String[] args) {
        
        new SpringApplicationBuilder(ApplicationServer.class).web(true).run(args);
    }
}
