package com.example.demospringcloudgateway;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@SpringBootApplication
public class DemoSpringCloudGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringCloudGatewayApplication.class, args);
	}

	@GetMapping
	public String hello(){
		log.info("DemoSpringCloudGatewayApplication hello :)) ");
		return "hello from spring cloud gateway new";
	}
}
