package com.springboot.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.demo.model.Greeting;


@RestController
@RequestMapping("/v1")
public class SpringBootDemoController {

	/*
	 * 
	 * When Spring Boot starts, it does a class path scanning and maps this method
	 * with the annotated URL.
	 * 
	 * 
	 */
	@GetMapping("/greeting")
	public String demoController() {
		return "Hemlo World from Sprimng!";
	}
	
	@GetMapping("/greetings")
	public List<Greeting> getAllGreetings() {
		return Arrays.asList(new Greeting("Tom"," Hello"),
				new Greeting("Dick"," Hola"),
				new Greeting("Harry"," Hi"));
	}
}
