package com.southwind.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wzl
 * @since 2020-08-28 09:56
 */
@FeignClient(name = "nacos-provider")
public interface HelloFeignClient {

    @RequestMapping("/nacos/provider/hello")
    String hello();
}
