package com.bedbug;

import java.security.Principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GoogleserviceApplication {
	public static void main(String[] args) {
	   SpringApplication.run(GoogleserviceApplication.class, args);
	}
	@RequestMapping(value = "/user")
	public Principal user(Principal principal) {
	   return principal;
	}
 }