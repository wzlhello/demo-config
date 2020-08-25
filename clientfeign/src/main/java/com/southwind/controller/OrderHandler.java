package com.southwind.controller;

import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.southwind.entity.Admin;
import com.southwind.entity.Menu;
import com.southwind.entity.Order;
import com.southwind.entity.User;
import com.southwind.entity.vo.OrderVO;
import com.southwind.feign.OrderFeign;

/**
 * @author wzl
 * @since 2020-08-24 17:08
 */
@Controller
@RequestMapping("/order")
public class OrderHandler {
    @Autowired
    private OrderFeign orderFeign;

    @GetMapping("/save/{mid}")
    public String save(@PathVariable("mid") long mid, HttpSession session){
        User user = (User) session.getAttribute("user");
        Order order = new Order();
        Menu menu = new Menu();
        menu.setId(mid);
        order.setUser(user);
        order.setMenu(menu);
        order.setDate(new Date());
        orderFeign.save(order);
        return "redirect:/account/redirect/order";
    }

    @GetMapping("/findAllByUid")
    @ResponseBody
    public OrderVO findAllByUid(@RequestParam("page") int page, @RequestParam("limit") int limit,HttpSession session){
        User user = (User) session.getAttribute("user");
        return orderFeign.findAllByUid(user.getId(), page, limit);
    }

    @GetMapping("/findAllByState")
    @ResponseBody
    public OrderVO findAllByState(@RequestParam("page") int page, @RequestParam("limit") int limit){
        return orderFeign.findAllByState(0, page, limit);
    }

    @GetMapping("/updateState/{id}/{state}")
    public String updateState(@PathVariable("id") long id,@PathVariable("state") int state,HttpSession session){
        Admin admin = (Admin) session.getAttribute("admin");
        orderFeign.updateState(id,state,admin.getId());
        return "redirect:/account/redirect/order_handler";
    }
}
