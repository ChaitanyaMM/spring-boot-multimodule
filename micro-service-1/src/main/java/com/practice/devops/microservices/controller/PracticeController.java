package com.practice.devops.microservices.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/microapp")
public class PracticeController {

	@GetMapping("/one")
	public String getSample() {
		return "micro-app-01";
	}

}