package com.wustzdy.springCloud.serviceA.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/user")
@RestController
public class UserController {

    @RequestMapping("who")
    public String who() {
        return "my name is liangwang";
    }
}
