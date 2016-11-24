package com.yuhou.netflix;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by yuhou on 2016/11/24.
 */
@EnableZuulProxy
@SpringCloudApplication //SpringBootApplication、@EnableDiscoveryClient、@EnableCircuitBreaker
public class ApplicationNetFlix {

    public static void main(String[] args) {

        new SpringApplicationBuilder(ApplicationNetFlix.class).web(true).run(args);

    }
}
