package com.pos.pos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class POSMainController {

	@GetMapping("/hello")
	public String Hello(){
		return"My first pos service";
	}
}
