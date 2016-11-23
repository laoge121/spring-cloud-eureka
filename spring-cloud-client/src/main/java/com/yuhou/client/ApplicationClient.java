package com.yuhou.client;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * 服务客户端
 * Created by yuhou on 2016/11/23.
 */
@EnableDiscoveryClient //引入eureka 云配置
@SpringBootApplication
@EnableFeignClients//引入feign 路由
@EnableCircuitBreaker//引入断路
public class ApplicationClient {


    @LoadBalanced
    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }


    public static void main(String[] args) {
        new SpringApplicationBuilder(ApplicationClient.class).web(true).run(args);
    }
}
