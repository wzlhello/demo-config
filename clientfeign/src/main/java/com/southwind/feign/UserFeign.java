package com.southwind.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.southwind.entity.User;
import com.southwind.entity.vo.UserVO;

/**
 * @author wzl
 * @since 2020-08-24 16:58
 */
@FeignClient(value = "user")
public interface UserFeign {
    @GetMapping("/user/findAll/{page}/{limit}")
    public UserVO findAll(@PathVariable("page") int page, @PathVariable("limit") int limit);

    @PostMapping("/user/save")
    public void save(@RequestBody User user);

    @DeleteMapping("/user/deleteById/{id}")
    public void deleteById(@PathVariable("id") long id);
}
