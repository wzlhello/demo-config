package com.southwind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author wzl
 * @since 2020-08-25 16:52
 */
@SpringBootApplication
public class ZipkinClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZipkinClientApplication.class,args);
    }
}
