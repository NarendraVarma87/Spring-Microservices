package com.varma.first.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.varma.first.feignclient.CallOpenFeignClient;

@RestController
@RequestMapping("/get")
public class CallController {
	@Autowired
	private CallOpenFeignClient feignClient;
	
	@GetMapping("/userdata")
	public String getUserName() {
		return feignClient.getName();
	}
	
}
