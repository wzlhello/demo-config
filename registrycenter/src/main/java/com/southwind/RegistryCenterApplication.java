package com.southwind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * registrycenter注册中心
 *
 * @author wzl
 * @since 2020-08-24 11:04
 */
@SpringBootApplication
@EnableEurekaServer
public class RegistryCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(RegistryCenterApplication.class,args);
    }

}
