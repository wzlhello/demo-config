package com.southwind.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.southwind.entity.Account;

/**
 * @author wzl
 * @since 2020-08-26 10:52
 */
@RestController
@RequestMapping("/ribbon")
public class RibbonHandler {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/account/login/{username}/{password}/{type}")
    public Account login(@PathVariable("username") String username, @PathVariable("password") String password,
            @PathVariable("type") String type){
        return restTemplate.getForObject("http://account/login/{username}/{password}/{type}",Account.class,username,
                password,type);
    }

    @GetMapping("/index")
    public String index(){
        return restTemplate.getForObject("http://account/redirect/index",String.class);
    }

}
