package com.southwind.entity;

import lombok.Data;

/**
 * 菜单类对应t_menu
 *
 * @author wzl
 * @since 2020-08-24 13:50
 */
@Data
public class Menu {
    private long id;
    private String name;
    private double price;
    private String flavor;
    private Type type;
}
