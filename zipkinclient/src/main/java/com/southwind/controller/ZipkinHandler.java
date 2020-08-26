package com.southwind.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wzl
 * @since 2020-08-25 16:54
 */
@RestController
@RequestMapping("zipkin")
public class ZipkinHandler {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/index")
    public String index(){
        return "当前的端口"+this.port;
    }
}
