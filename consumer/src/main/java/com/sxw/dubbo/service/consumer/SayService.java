package com.sxw.dubbo.service.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.sxw.dubbo.service.provider.SayHello;
import org.springframework.stereotype.Component;

@Component
public class SayService  {
    @Reference
    SayHello sayHello;

    public String say (String name) {

        return sayHello.sayHello(name);
    }
}