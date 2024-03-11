package com.varma.first.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {
	@GetMapping("/get")
	public String getAll() {
		return "Hello Nari Welcome to Second Microservice...";
	}
}
