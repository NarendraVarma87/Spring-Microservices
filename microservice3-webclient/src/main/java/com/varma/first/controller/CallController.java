package com.varma.first.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/")
public class CallController {

	@Autowired
	private  WebClient webClient8881;
	@Autowired
	private  WebClient webClient8882;

    @GetMapping("/get/user")
    public Mono<String> getData() {
        return webClient8881.get()
                .uri("/get/name")
                .retrieve()
                .bodyToMono(String.class)
                .map(userName -> "Hello " + userName);
    }
    @GetMapping("/get/other")
    public Mono<String> getAnotherData(){
    	return webClient8882.get()
    			.uri("/api/get")
    			.retrieve()
    			.bodyToMono(String.class)
    			.map(data-> "Hi " + data);
    }
}
