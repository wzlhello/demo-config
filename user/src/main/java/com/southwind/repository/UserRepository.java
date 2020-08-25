package com.southwind.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.southwind.entity.User;

/**
 * @author wzl
 * @since 2020-08-24 14:07
 */
@Repository
public interface UserRepository {
    public List<User> findAll(int index, int limit);
    public int count();
    public void save(User user);
    public void deleteById(long id);
}
