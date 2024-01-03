package com.demo.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.demo.example.entities.Users;
import com.demo.example.services.UserService;

@Controller
public class UsersController {
	
	@GetMapping("/registerform")
	public String registerPage() {
		return "register";
	}
	@Autowired
	UserService service;
	@PostMapping("/register")
	public String addUsers(@ModelAttribute Users user) { 
	service.addUsers(user);
	return "home";
		
	}

}
