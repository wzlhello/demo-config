package com.southwind.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.southwind.entity.Order;
import com.southwind.entity.vo.OrderVO;

/**
 * @author wzl
 * @since 2020-08-24 16:57
 */
@FeignClient(value = "order")
public interface OrderFeign {
    @PostMapping("/order/save")
    public void save(@RequestBody Order order);

    @GetMapping("/order/findAllByUid/{uid}/{page}/{limit}")
    public OrderVO findAllByUid(@PathVariable("uid") long uid, @PathVariable("page") int page, @PathVariable("limit") int limit);

    @DeleteMapping("/order/deleteByMid/{mid}")
    public void deleteByMid(@PathVariable("mid") long mid);

    @DeleteMapping("/order/deleteByUid/{uid}")
    public void deleteByUid(@PathVariable("uid") long uid);

    @GetMapping("/order/findAllByState/{state}/{page}/{limit}")
    public OrderVO findAllByState(@PathVariable("state") int state, @PathVariable("page") int page, @PathVariable("limit") int limit);

    @PutMapping("/order/updateState/{id}/{state}/{aid}")
    public void updateState(@PathVariable("id") long id, @PathVariable("state") long state,@PathVariable("aid") long aid);
}
