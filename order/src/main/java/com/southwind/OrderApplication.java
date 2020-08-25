package com.southwind;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * order
 *
 * @author wzl
 * @since 2020-08-24 13:41
 */
@SpringBootApplication
@MapperScan("com.southwind.repository")
public class OrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class, args);
    }
}
