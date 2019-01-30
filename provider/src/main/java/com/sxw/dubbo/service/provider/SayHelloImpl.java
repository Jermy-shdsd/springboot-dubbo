package com.sxw.dubbo.service.provider;

import com.alibaba.dubbo.config.annotation.Service;

@Service
public class SayHelloImpl implements SayHello {
    @Override
    public String sayHello(String name) {
        return "Hello " + name + "!";
    }
}
