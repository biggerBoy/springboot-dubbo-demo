package com.yya.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.yya.springboot.dubbo.TestService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController{
    @Reference(application = "${dubbo.application.id}",version = "1.0")
    private TestService testService;
    @RequestMapping("/getdata/{name}")
    public String getData(@PathVariable("name") String name){
        String data = testService.getData(name);
        return data;
    }
}
