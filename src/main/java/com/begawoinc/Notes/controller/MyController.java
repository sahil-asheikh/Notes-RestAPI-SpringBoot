package com.begawoinc.Notes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping("/home")
	public String home() {
		return "Congrats, your first RestAPI application has been worked";
	}
	
	@GetMapping("/home/{name}")
	public String home(@PathVariable String name) {
		return "Welcome " + name;
	}
	
}
