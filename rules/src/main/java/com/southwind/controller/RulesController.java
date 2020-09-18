package com.southwind.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.southwind.service.DroolsService;
import com.southwind.vo.CommonResponse;

/**
 * @author wzl
 * @since 2020-09-18 11:08
 */
@RestController
public class RulesController {


    @Autowired
    private DroolsService droolsService;

    @PostMapping(value = "/rule/test")
    public CommonResponse<String> write(@RequestBody Map<String,String> message){
        droolsService.process(message);

        CommonResponse<String> status = new CommonResponse<>();
        status.setCode("200");
        status.setMessage("Bingo");
        status.setData(new Gson().toJson(message));

        return status;
    }
}
