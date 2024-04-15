package com.springboot.dashboard.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

	@GetMapping("/")
	public String landingPage() {
		return "login";
	}

	@GetMapping("/login")
	public String loginPage() {
		return "login";
	}

	@GetMapping("/access-denied")
	public String accessDenied() {
		return "/access-denied";
	}

}
