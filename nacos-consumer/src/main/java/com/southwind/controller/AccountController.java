package com.southwind.controller;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wzl
 * @since 2020-08-31 15:23
 */
@RestController
@RequestMapping("/account")
public class AccountController {

    /**
     * service方法使用注解        //@GlobalTransactional(name = "my-xxx",rollbackFor = Exception.class)
     * @param id
     * @param bigDecimal
     * @return
     */
    @RequestMapping(value = "/decrease")
    public boolean decrease(Integer id,BigDecimal bigDecimal){

        return true;
    }
}
