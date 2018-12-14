package com.yya.springboot.dubbo.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.yya.springboot.dubbo.TestService;

@Service(application = "${dubbo.application.id}",protocol = "${dubbo.protocol.id}",
        version = "1.0",registry = "${dubbo.registry.id}")
public class TestServiceImpl implements TestService{
    @Override
    public String getData(String name) {
        return "request is "+name;
    }
}
