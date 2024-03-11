package com.varma.first.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value="ERUKA-CLIENT-2" , url="http://localhost:8882/api")
public interface CallOpenFeignClient {
	@GetMapping("/get")
	String getName();
	
}
