package com.southwind.service;

import org.springframework.stereotype.Service;

import com.southwind.feign.HelloFeignClient;

/**
 * @author wzl
 * @since 2020-08-28 09:58
 */
@Service
public class HelloService {

    private final HelloFeignClient helloFeignClient;

    public HelloService(final HelloFeignClient helloFeignClient){
        this.helloFeignClient = helloFeignClient;
    }

    public String hello() {
        return helloFeignClient.hello();
    }
}
