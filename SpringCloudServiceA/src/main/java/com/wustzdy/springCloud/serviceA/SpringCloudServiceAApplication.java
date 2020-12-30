package com.wustzdy.springCloud.serviceA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SpringCloudServiceAApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudServiceAApplication.class, args);
    }

}
