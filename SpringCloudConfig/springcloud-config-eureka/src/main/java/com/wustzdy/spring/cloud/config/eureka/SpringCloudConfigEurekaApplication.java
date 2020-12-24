package com.wustzdy.spring.cloud.config.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author pancm
 * @Title: SpringCloudConfigEurekaApplication
 * @Description: springcloud服务入口
 * EnableEurekaServer 注解启动一个服务注册中心
 * @Version:1.0.0
 */
@SpringBootApplication
@EnableEurekaServer
public class SpringCloudConfigEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConfigEurekaApplication.class, args);
        System.out.println("注册中心服务启动...");
    }
}
