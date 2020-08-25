package com.southwind.entity.vo;

import java.util.List;

import com.southwind.entity.User;
import lombok.Data;

/**
 * @author wzl
 * @since 2020-08-24 14:06
 */
@Data
public class UserVO {
    private int code;
    private String msg;
    private int count;
    private List<User> data;
}
