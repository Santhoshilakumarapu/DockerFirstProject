package com.java.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/messages")
	public String welcome()
	{
		return "welcome to Docker using Jenkins ... ";
	}

}
