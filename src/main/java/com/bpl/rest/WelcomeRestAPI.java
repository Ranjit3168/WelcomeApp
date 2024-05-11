package com.bpl.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestAPI {

	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome To Hyderabad";
	}
}
