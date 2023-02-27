package com.demo.service.airbnbService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class AirbnbServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AirbnbServiceApplication.class, args);
	}

}
