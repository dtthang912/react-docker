package com.thang.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Microservice2Controller {
	@RequestMapping("/microservice2")
	public String hello() {
		return "micro2";
	}
}
