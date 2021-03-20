package com.springboot.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class SpringBootDemoController {

	
	@GetMapping("/greeting")
	public String demoController() {
		return "Hemlo World from Sprimng!";
	}
}
