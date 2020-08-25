package com.southwind;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 用户
 *
 * @author wzl
 * @since 2020-08-24 14:03
 */
@SpringBootApplication
@MapperScan("com.southwind.repository")
public class UserApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }
}
