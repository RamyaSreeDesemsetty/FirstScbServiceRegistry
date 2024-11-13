package com.cg.FirstScbServiceRegistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class FirstScbServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstScbServiceRegistryApplication.class, args);
	}

}
