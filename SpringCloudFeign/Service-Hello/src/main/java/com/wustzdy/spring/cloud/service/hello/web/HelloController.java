package com.wustzdy.spring.cloud.service.hello.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Value("${server.port}")
    String port;

    @RequestMapping("/hello.action")
    public  String sayHello(@RequestParam(value = "name",defaultValue = "xiaoming") String name){

        return "my name is:" + name +", port is : " + port;
    }

}
