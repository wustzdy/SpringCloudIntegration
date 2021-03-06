package com.wustzdy.springCloud.feign.feign.api;

import com.wustzdy.springCloud.feign.model.Person;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "hello-service-provider")
public interface HelloServiceFeign {

    @RequestMapping(value = "/demo/getHost", method = RequestMethod.GET)
    public String getHost(@RequestParam("name") String name);

    @RequestMapping(value = "/demo/postPerson", method = RequestMethod.POST, produces = "application/json; charset=UTF-8")
    public Person postPerson(@RequestParam("name") String name);
}