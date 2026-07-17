package com.prasadJayant.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class GreetingController {
	final Greeting greeting;
	AtomicLong counter = new AtomicLong();

	GreetingController(Greeting greeting) {
		this.greeting = greeting;
	}

	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name") String name) {
		greeting.setContent("Hey I am learning Spring Boot " + name);
		greeting.setId(counter.incrementAndGet());
		
		return greeting;

	}

}
