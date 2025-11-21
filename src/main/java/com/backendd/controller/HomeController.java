package com.backendd.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	
	@GetMapping("v1/home")
	public String getHome() {
		return "It is first backend returnn";
	}
}
