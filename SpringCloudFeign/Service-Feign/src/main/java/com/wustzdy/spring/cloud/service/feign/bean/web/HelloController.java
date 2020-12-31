/**
 * Copyright (C), 2009-2019, 智游集团
 * FileName: HelloController
 * Author:   laosun
 * Date:     2019/11/22 6:36 下午
 * Description:
 */
package com.wustzdy.spring.cloud.service.feign.bean.web;

import com.wustzdy.spring.cloud.service.feign.bean.feign.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @RequestMapping(value = "/hello.action")
    public String sayHello(@RequestParam("name") String name) {
        return helloService.sayHello(name);
    }
}
