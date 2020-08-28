package com.southwind.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wzl
 * @since 2020-08-28 09:43
 */
@RestController
@RequestMapping("/nacos/provider")
public class HelloController {

    @Value("${user.name}")
    private String userName;

    @RequestMapping("/hello")
    private String hello(){

        return "hello:"+ userName;
    }
}
