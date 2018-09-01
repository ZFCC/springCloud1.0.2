package com.sn.springCloud102;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaProviderA {

	public static void main(String[] args) {
//		SpringApplication.run(EurekaProviderA.class, args);

		new SpringApplicationBuilder(EurekaProviderA.class).properties("server.port="+8080).run(args);
	}
}
