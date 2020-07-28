package com.hello.hello1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/hello1")

public class Hello1Controller {

	@GetMapping public String hello1()
	{
		return "Hello Generation, hoje estou exercitando atenção aos detalhes, mentalidade de crescimento e muuuuuuuuuita persistência, Socorro Deus!!!!";
	}
}
