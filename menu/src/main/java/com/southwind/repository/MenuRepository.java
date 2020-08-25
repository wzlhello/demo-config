package com.southwind.repository;

import java.util.List;

import com.southwind.entity.Menu;

/**
 * 菜单DAO
 *
 * @author wzl
 * @since 2020-08-24 13:54
 */
public interface MenuRepository {
    public List<Menu> findAll(int index,int limit);
    public int count();
    public void save(Menu menu);
    public Menu findById(long id);
    public void update(Menu menu);
    public void deleteById(long id);
}
