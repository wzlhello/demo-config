package com.southwind.repository;

import com.southwind.entity.Admin;

/**
 * AdminRepository 接口
 *
 * @author wzl
 * @since 2020-08-24 11:22
 */
public interface AdminRepository {
    public Admin login(String username,String password);
}
