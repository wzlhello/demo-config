package com.southwind.repository;

import com.southwind.entity.User;

/**
 * UserRepository接口
 *
 * @author wzl
 * @since 2020-08-24 11:21
 */
public interface UserRepository {
    public User login(String username,String password);
}
