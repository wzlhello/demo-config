package com.southwind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author wzl
 * @since 2020-08-24 14:11
 */
@SpringBootApplication
@EnableFeignClients
@ServletComponentScan
@EnableCircuitBreaker
@EnableHystrixDashboard
public class ClientFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientFeignApplication.class, args);
    }

    /**
     * LoadBalanced：声明一个基于 Ribbon 的负载均衡。
     * @return
     */
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
