package com.springboot.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.demo.model.DemoResponse;
import com.springboot.demo.model.Greeting;
import com.springboot.demo.model.ServiceMessage;
import com.springboot.demo.service.DemoService;

/**
 * The Class SpringBootDemoController.
 */
@RestController //
@RequestMapping("/v1")
public class SpringBootDemoController {
	
	/**
	 * Instantiates a new spring boot demo controller.
	 *
	 * @param demoService the demo service
	 */
	@Autowired
	public SpringBootDemoController(DemoService demoService) {
		super();
		this.demoService = demoService;
	}

	/** The demo service. */
	@Autowired
	DemoService demoService;
	
	

	/**
	 * Demo controller.
	 *
	 * @return the string
	 */
	/*
	 * 
	 * When Spring Boot starts, it does a class path scanning and maps this method
	 * with the annotated URL.
	 * 
	 * 
	 */
	@GetMapping("/greeting/{user}/?language={language}")
	public String demoController() {
		return "Hemlo World from Sprimng!";
	}

	/**
	 * Gets the all greetings.
	 *
	 * @return the all greetings
	 */
	@GetMapping("/greetings")
	public List<Greeting> getAllGreetings() {
		demoService.testService();
		return Arrays.asList(new Greeting("Tom", " Hello"), new Greeting("Dick", " Hola"),
				new Greeting("Harry", " Hi"));
	}

	@GetMapping("/nick")
	public DemoResponse demoController01() {
		
		DemoResponse demoResponse = new DemoResponse();
		
		Greeting greeting = new Greeting("Nick","Hello");
		
		ServiceMessage serviceMessage = new ServiceMessage();
		
		serviceMessage.setCode("200");
		serviceMessage.setDescription("Request completed succesfully");
		serviceMessage.setType("OK");
		
		demoResponse.setGreeting(greeting);	
		demoResponse.setServiceMessage(serviceMessage);
		return demoResponse;
	}
}
