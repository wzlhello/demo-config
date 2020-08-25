package com.southwind.entity;

import java.util.Date;

import lombok.Data;

/**
 * Account账户类
 *
 * @author wzl
 * @since 2020-08-24 11:18
 */
@Data
public class Account {
    private long id;
    private String username;
    private String password;
    private String nickname;
    private String gender;
    private String telephone;
    private Date registerdate;
    private String address;
}
