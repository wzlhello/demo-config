package com.southwind.entity;

import java.util.Date;


import lombok.Data;

/**
 * Order类，对应t_order表
 *
 * @author wzl
 * @since 2020-08-24 13:44
 */
@Data
public class Order {
    private long id;
    private User user;
    private Menu menu;
    private Admin admin;
    private Date date;
    private int state;
}
