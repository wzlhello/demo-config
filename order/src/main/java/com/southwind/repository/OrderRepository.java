package com.southwind.repository;

import java.util.List;

import com.southwind.entity.Order;

/**
 * @author wzl
 * @since 2020-08-25 14:51
 */
public interface OrderRepository {
    public void save(Order order);
    public List<Order> findAllByUid(long uid,int index,int limit);
    public int countByUid(long uid);
    public void deleteByMid(long mid);
    public void deleteByUid(long uid);
    public List<Order> findAllByState(int state,int index,int limit);
    public int countByState(int state);
    public void updateState(long id,long aid,int state);
}
