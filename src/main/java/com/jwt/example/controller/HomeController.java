package com.jwt.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jwt.example.UserService.UserService;
import com.jwt.example.entity.User;

@RestController
@RequestMapping("/home")
public class HomeController {
	
	@Autowired
	private UserService userService;

	@GetMapping("/user")
	public List<User> getUser() {
		
		System.out.println("getting Users");
		return userService.getUsers();
		
	}
}
