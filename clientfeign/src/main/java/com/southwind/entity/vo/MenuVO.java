package com.southwind.entity.vo;

import java.util.List;

import com.southwind.entity.Menu;
import lombok.Data;

/**
 * 菜单VO
 *
 * @author wzl
 * @since 2020-08-24 13:52
 */
@Data
public class MenuVO {
    private int code;
    private String msg;
    private int count;
    private List<Menu> data;
}
