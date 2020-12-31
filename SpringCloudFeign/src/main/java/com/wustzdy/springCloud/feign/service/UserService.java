package com.wustzdy.springCloud.feign.service;

import com.wustzdy.springCloud.feign.feign.api.HelloServiceFeign;
import com.wustzdy.springCloud.feign.model.Person;
import org.springframework.stereotype.Service;

@Service
public class UserService implements HelloServiceFeign {


    public String getHost(String name) {
        return "This is a host";
    }

    public Person postPerson(String name) {
        return new Person(name, 12);
    }
}