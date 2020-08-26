package com.southwind.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.southwind.entity.Account;
import com.southwind.feign.fallback.AccountFeignError;

/**
 * @author wzl
 * @since 2020-08-24 14:16
 */
@FeignClient(value = "account",fallback = AccountFeignError.class)
public interface AccountFeign {
    @GetMapping("/account/login/{username}/{password}/{type}")
    public Account login(@PathVariable("username") String username, @PathVariable("password") String password, @PathVariable("type") String type);
}
