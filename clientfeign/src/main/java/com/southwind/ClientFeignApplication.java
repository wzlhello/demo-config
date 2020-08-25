package com.southwind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author wzl
 * @since 2020-08-24 14:11
 */
@SpringBootApplication
@EnableFeignClients
@ServletComponentScan
public class ClientFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientFeignApplication.class, args);
    }
}
