package com.wustzdy.spring.cloud.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author pancm
 * @Title: SpringCloudConfigServerApplication
 * @Description: 程序入口
 * EnableDiscoveryClient: 启用服务注册与发现
 * EnableConfigServer:    启用config配置中心
 * @Version:1.0.0
 */
@EnableDiscoveryClient
@EnableConfigServer
@SpringBootApplication
public class SpringCloudConfigServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConfigServerApplication.class, args);
        System.out.println("配置中心服务端启动成功!");
    }
}
