package com.chaitu.hmsrest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@RequestMapping(value = "/")
	public String helloWorld() {
		return "Welcome to Hostel Management System\n";
	}
}
