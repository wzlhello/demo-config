package com.southwind.entity;

import java.util.Date;

import lombok.Data;

/**
 * @author wzl
 * @since 2020-08-24 14:05
 */
@Data
public class User {
    private long id;
    private String username;
    private String password;
    private String nickname;
    private String gender;
    private String telephone;
    private Date registerdate;
    private String address;
}
