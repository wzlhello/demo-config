package com.southwind.entity.vo;

import java.util.List;

import com.southwind.entity.Order;

import lombok.Data;

/**
 * @author wzl
 * @since 2020-08-25 15:55
 */
@Data
public class OrderVO {
    private int code;
    private String msg;
    private int count;
    private List<Order> data;
}
