package com.southwind.feign.fallback;

import org.springframework.stereotype.Component;

import com.southwind.entity.Account;
import com.southwind.feign.AccountFeign;

/**
 * @author wzl
 * @since 2020-08-26 10:38
 */
@Component
public class AccountFeignError implements AccountFeign {

    @Override
    public Account login(String username, String password, String type) {
        System.out.println("服务维护中。。。");
        return null;
    }
}
