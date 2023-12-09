package com.example.demospringcloudgateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                      .route("product-service", r -> r.path("/product-service/**")
                                                      .filters(f -> f.rewritePath("/product-service/(?<segment>.*)", "/${segment}")
                                                                     .addRequestHeader("X-Custom-Header", "CustomHeaderValue"))
                                                      .uri("http://product-service:8080"))
                      .build();
    }
}