package com.southwind.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.southwind.entity.User;
import com.southwind.entity.vo.UserVO;
import com.southwind.repository.UserRepository;

/**
 * @author wzl
 * @since 2020-08-24 14:08
 */
@RestController
@RequestMapping("/user")
public class UserHandler {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/findAll/{page}/{limit}")
    public UserVO findAll(@PathVariable("page") int page, @PathVariable("limit") int limit){
        UserVO userVO = new UserVO();
        userVO.setCode(0);
        userVO.setMsg("");
        userVO.setCount(userRepository.count());
        userVO.setData(userRepository.findAll((page-1)*limit,limit));
        return userVO;
    }

    @PostMapping("/save")
    public void save(@RequestBody User user){
        user.setRegisterdate(new Date());
        userRepository.save(user);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") long id){
        userRepository.deleteById(id);
    }
}
