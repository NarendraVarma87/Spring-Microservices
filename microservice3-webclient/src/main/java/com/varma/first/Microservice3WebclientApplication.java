package com.varma.first;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Microservice3WebclientApplication {
	   @Bean
	    @Qualifier("webClient8881")
	    WebClient webClient8881() {
	        return WebClient.builder()
	                .baseUrl("http://localhost:8881")
	                .build();
	    }

	    @Bean
	    @Qualifier("webClient8882")
	    WebClient webClient8882() {
	        return WebClient.builder()
	                .baseUrl("http://localhost:8882")
	                .build();
	    }
	public static void main(String[] args) {
		SpringApplication.run(Microservice3WebclientApplication.class, args);
	}
}
