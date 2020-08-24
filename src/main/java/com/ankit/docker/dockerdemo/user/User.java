package com.ankit.docker.dockerdemo.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class User {

	
	@GetMapping("/hello")
	public String helloWorld() {
		//Adding some comments.
		return "Hello World";
	}
}
