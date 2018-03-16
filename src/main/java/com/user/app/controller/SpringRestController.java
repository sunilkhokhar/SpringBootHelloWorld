
package com.user.app.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class SpringRestController {

	@RequestMapping("/")
	public String welcome() {
		return "Welcome Spring Boot";
	}
	
	@RequestMapping("/hello")
	public String myData() {
		return "Hello Spring Boot";
	}
}