package com.learning.gateway.moviegatewayroutingserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MovieGatewayRoutingServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieGatewayRoutingServerApplication.class, args);
	}

}
