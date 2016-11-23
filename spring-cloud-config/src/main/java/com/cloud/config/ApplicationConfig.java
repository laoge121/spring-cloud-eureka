package com.cloud.config;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by yuhou on 2016/11/23.
 */
@SpringBootApplication
@EnableConfigServer
public class ApplicationConfig {
    public static void main(String[] args) {
        new SpringApplicationBuilder(ApplicationConfig.class).web(true).run(args);
    }
}
