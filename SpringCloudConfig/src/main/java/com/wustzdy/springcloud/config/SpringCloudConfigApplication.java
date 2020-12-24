package com.wustzdy.springcloud.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringCloudConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConfigApplication.class, args);
    }

}
//https://www.cnblogs.com/fengzheng/p/11242128.html
//https://blog.csdn.net/wqr503/article/details/104049125
//https://codechina.csdn.net/mirrors/xuwujing/springcloud-study?utm_source=csdn_github_accelerator
//https://blog.csdn.net/qazwsxpcm/article/details/88578076