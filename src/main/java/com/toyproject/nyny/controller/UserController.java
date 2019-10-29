package com.toyproject.nyny.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@RequestMapping("/authCode")
	public void authCode() {
		
	}
	
	
	@RequestMapping("/login")
	public void login(){
		System.out.println("login controller");
	}
}
