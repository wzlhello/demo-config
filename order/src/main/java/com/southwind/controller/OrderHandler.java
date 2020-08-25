package com.southwind.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.southwind.entity.Order;
import com.southwind.entity.OrderVO;
import com.southwind.repository.OrderRepository;

/**
 * @author wzl
 * @since 2020-08-25 14:54
 */
@RestController
@RequestMapping("/order")
public class OrderHandler {
    @Autowired
    private OrderRepository orderRepository;

    @PostMapping("/save")
    public void save(@RequestBody Order order){
        orderRepository.save(order);
    }

    @GetMapping("/findAllByUid/{uid}/{page}/{limit}")
    public OrderVO findAllByUid(@PathVariable("uid") long uid, @PathVariable("page") int page, @PathVariable("limit") int limit){
        OrderVO orderVO = new OrderVO();
        orderVO.setCode(0);
        orderVO.setMsg("");
        orderVO.setCount(orderRepository.countByUid(uid));
        orderVO.setData(orderRepository.findAllByUid(uid,(page-1)*limit,limit));
        return orderVO;
    }

    @DeleteMapping("/deleteByMid/{mid}")
    public void deleteByMid(@PathVariable("mid") long mid){
        orderRepository.deleteByMid(mid);
    }

    @DeleteMapping("/deleteByUid/{uid}")
    public void deleteByUid(@PathVariable("uid") long uid){
        orderRepository.deleteByUid(uid);
    }

    @GetMapping("/findAllByState/{state}/{page}/{limit}")
    public OrderVO findAllByState(@PathVariable("state") int state, @PathVariable("page") int page, @PathVariable("limit") int limit){
        OrderVO orderVO = new OrderVO();
        orderVO.setCode(0);
        orderVO.setMsg("");
        orderVO.setCount(orderRepository.countByState(0));
        orderVO.setData(orderRepository.findAllByState(0,(page-1)*limit,limit));
        return orderVO;
    }

    @PutMapping("/updateState/{id}/{state}/{aid}")
    public void updateState(@PathVariable("id") long id, @PathVariable("state") int state, @PathVariable("aid") long aid){
        orderRepository.updateState(id,aid,state);
    }
}
