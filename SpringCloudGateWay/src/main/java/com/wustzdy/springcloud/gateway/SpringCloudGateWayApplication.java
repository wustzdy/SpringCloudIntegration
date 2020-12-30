package com.wustzdy.springcloud.gateway;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringCloudGateWayApplication {
    @Value("${test.uri}")
    private String uri;

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                //basic proxy
                .route(r -> r.path("/order/**")
                        .uri(uri)
                )
                .route(r -> r.path("/user/**")
                        .filters(f -> f
                                .hystrix(config -> config
                                        .setName("myserviceOne")
                                        .setFallbackUri("forward:/user/fallback")))
                        .uri(uri)).build();
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudGateWayApplication.class, args);
    }
}
