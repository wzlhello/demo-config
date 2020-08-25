package com.southwind.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.southwind.entity.Menu;
import com.southwind.entity.vo.MenuVO;
import com.southwind.feign.MenuFeign;
import com.southwind.feign.OrderFeign;

/**
 * @author wzl
 * @since 2020-08-24 17:06
 */
@Controller
@RequestMapping("/menu")
public class MenuHandler {

    @Autowired
    private MenuFeign menuFeign;
    @Autowired
    private OrderFeign orderFeign;

    @GetMapping("/findAll")
    @ResponseBody
    public MenuVO findAll(@RequestParam("page") int page, @RequestParam("limit") int limit){
        return menuFeign.findAll(page, limit);
    }

    @GetMapping("/prepareSave")
    public String prepareSave(Model model){
        model.addAttribute("list",menuFeign.findAll());
        return "menu_add";
    }

    @PostMapping("/save")
    public String save(Menu menu){
        menuFeign.save(menu);
        return "redirect:/account/redirect/menu_manage";
    }

    @GetMapping("/findById/{id}")
    public String findById(@PathVariable("id") long id,Model model){
        model.addAttribute("list",menuFeign.findAll());
        model.addAttribute("menu",menuFeign.findById(id));
        return "menu_update";
    }

    @PostMapping("/update")
    public String update(Menu menu){
        menuFeign.update(menu);
        return "redirect:/account/redirect/menu_manage";
    }

    @GetMapping("/deleteById/{id}")
    public String deleteById(@PathVariable("id") long id){
        orderFeign.deleteByMid(id);
        menuFeign.deleteById(id);
        return "redirect:/account/redirect/menu_manage";
    }
}
