package br.generation.com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")

public class HelloNewController {
	
@GetMapping	
public String hello() {
		
		return "Hello World!"
				+ " Aprender a codar com  "
				+ " spring boot! <3 ";
		
		
	}
	

}
