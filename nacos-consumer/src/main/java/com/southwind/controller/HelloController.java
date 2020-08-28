package com.southwind.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.southwind.service.HelloService;

/**
 * @author wzl
 * @since 2020-08-28 10:02
 */
@RestController
@RequestMapping("/nacos/consumer")
public class HelloController {
    private final HelloService helloService;

    public HelloController(final HelloService helloService) {
        this.helloService = helloService;
    }

    @RequestMapping("/hello")
    public String hello() {
        String hello = helloService.hello();
        return hello;
    }
}
