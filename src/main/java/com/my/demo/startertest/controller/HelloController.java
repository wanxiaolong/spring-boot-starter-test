package com.my.demo.startertest.controller;

import com.my.demo.starter.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    //注意：这里的HelloService来自于自定义的spring-boot-starter-hello
    //因此需要在application.properties配置属性hello.enabled=true
    //才会通过Starter的自动配置类HelloServiceAutoConfiguration创建
    //如果不配置hello.enable=true，那么这里注入将会失败
    @Autowired
    private HelloService helloService;

    @GetMapping("/")
    public String index() {
        return helloService.sayHello();
    }
}
