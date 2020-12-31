
package com.wustzdy.spring.cloud.servcie.ribbon.bean.controller;

import com.wustzdy.spring.cloud.servcie.ribbon.bean.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private HelloService helloService;

    @GetMapping(value = "/hello.action")
    public String hello(@RequestParam String name) {
        return helloService.helloService(name);
    }

}
