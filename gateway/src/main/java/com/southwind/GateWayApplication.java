package com.southwind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author wzl
 * @since 2020-08-26 11:07
 */
@EnableZuulProxy
@EnableAutoConfiguration
public class GateWayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GateWayApplication.class,args);
    }
}
