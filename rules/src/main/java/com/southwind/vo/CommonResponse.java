package com.southwind.vo;

import lombok.Data;

/**
 * @author wzl
 * @since 2020-09-18 11:10
 */
@Data
public class CommonResponse<T> {

    private String code;
    private String message;

    private T data;
}
