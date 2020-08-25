package com.southwind;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 菜单服务
 *
 * @author wzl
 * @since 2020-08-24 13:48
 */
@SpringBootApplication
@MapperScan("com.southwind.repository")
public class MenuApplication {

    public static void main(String[] args) {
        SpringApplication.run(MenuApplication.class, args);
    }
}
