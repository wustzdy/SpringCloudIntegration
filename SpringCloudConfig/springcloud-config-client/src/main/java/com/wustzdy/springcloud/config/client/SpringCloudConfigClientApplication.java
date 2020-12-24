package com.wustzdy.springcloud.config.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author pancm
 * @Title: Application
 * @Description: 程序入口
 * EnableDiscoveryClient 表示该项目就具有了服务注册的功能
 * @Version:1.0.0
 */
@EnableDiscoveryClient
@SpringBootApplication
public class SpringCloudConfigClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConfigClientApplication.class, args);
        System.out.println("配置中心客户端启动成功!");
    }
}
