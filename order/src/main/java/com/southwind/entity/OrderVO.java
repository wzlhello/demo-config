package com.southwind.entity;

import java.util.List;

import lombok.Data;

/**
 * @author wzl
 * @since 2020-08-25 14:51
 */
@Data
public class OrderVO {
    private int code;
    private String msg;
    private int count;
    private List<Order> data;
}
