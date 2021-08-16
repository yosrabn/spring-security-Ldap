package com.xadmin.Ldap.springsecurityLdap.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {

	@GetMapping("/")
	public String securityMethod()
	{
		return "Welcome to the home page!";
	}
}
