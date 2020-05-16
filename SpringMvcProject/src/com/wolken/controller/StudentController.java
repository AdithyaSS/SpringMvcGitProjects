package com.wolken.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {
	@ResponseBody
	@RequestMapping(value = "/hello")
	public String getHello() {
		return "Hello";
	}

	@ResponseBody
	@RequestMapping(value = "/welcomePage", method = RequestMethod.GET)
	public String welcome() {
		return "Welcome to Spring MVC framework";
	}
}
