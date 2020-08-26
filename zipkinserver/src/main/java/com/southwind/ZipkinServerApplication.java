package com.southwind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import zipkin.server.internal.EnableZipkinServer;

/**
 * @author wzl
 * @since 2020-08-25 16:46
 */
@SpringBootApplication
@EnableZipkinServer
public class ZipkinServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZipkinServerApplication.class,args);
    }
}
