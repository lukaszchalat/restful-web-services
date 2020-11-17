package de.lukaszchalat.rest.webservices.restfulwebservices.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import de.lukaszchalat.rest.webservices.restfulwebservices.model.AuthenticationBean;
import de.lukaszchalat.rest.webservices.restfulwebservices.model.HelloWorld;

@RestController
@CrossOrigin(origins= "http://localhost:4200")
public class AutenticationController {
	
	@GetMapping(path = "/basicauth")
	public AuthenticationBean authenticate() {
		return new AuthenticationBean("You are authenticated!");
	}
}
