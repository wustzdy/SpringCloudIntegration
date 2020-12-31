package com.wustzdy.springCloud.feign.controller;

import com.wustzdy.springCloud.feign.feign.api.HelloServiceFeign;
import com.wustzdy.springCloud.feign.model.Person;
import com.wustzdy.springCloud.feign.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController implements HelloServiceFeign {

    @Autowired
    private UserService userService;


    @RequestMapping(value = "/client/postPerson", method = RequestMethod.POST, produces = "application/json; charset=UTF-8")
    public Person postPerson(String name) {
        return userService.postPerson(name);
    }


    @RequestMapping(value = "/client/getHost", method = RequestMethod.GET)
    public String getHost(String name) {
        return userService.getHost(name);
    }
}
