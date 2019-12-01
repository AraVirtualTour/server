package com.explore.virtualtour;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
  	private static final String greetingTemplate = "Hello, %s!";
  	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/api/greeting")
	public Greeting greeting(@RequestParam(required=false, defaultValue="World") String name) {
		System.out.println("==== in greeting ====");
		return new Greeting(counter.incrementAndGet(), String.format(greetingTemplate, name));
	}
}