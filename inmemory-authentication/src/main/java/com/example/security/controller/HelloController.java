package com.example.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
public class HelloController {

	@Autowired
	private PasswordEncoder passwordEncoder;

	@GetMapping(value = "hello/{user}")
	public String sayHello(@PathVariable("user") String user) {
		String pass = passwordEncoder.encode("123456");
		return "Hello, " + pass;
	}
	
	@GetMapping(value = "/")
	public String homePage() {
		return "<h3>Welcome Page</h3>";
	}
	
	@GetMapping(value = "/user/dashboard")
	public String userDashboard() {
		return "<h3>User Dashboard</h3>";
	}
	
	@GetMapping(value = "/admin/dashboard")
	public String adminDashboard() {
		return "<h3>Admin Dashboard</h3>";
	}
	
}
