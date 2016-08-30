package com.chaitu.hmsrest.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@RequestMapping(value = "/")
	public String helloWorld(Model model) {
		return "index";
	}
}
