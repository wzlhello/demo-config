package com.southwind;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author wzl
 * @since 2020-08-24 11:16
 */
@SpringBootApplication
@MapperScan("com.southwind.repository")
public class AccountApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccountApplication.class,args);
    }
}
