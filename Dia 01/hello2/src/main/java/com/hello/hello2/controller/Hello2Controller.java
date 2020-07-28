package com.hello.hello2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/hello2")

public class Hello2Controller {
	
	@GetMapping public String hello2 ()
	{
		return "Aprendemos sobre SOFEA, REST, APIs, Camadas da Web, Métodos e Status HTTP e, por último, a como fazer o primeiro Hello World!";
	}
}