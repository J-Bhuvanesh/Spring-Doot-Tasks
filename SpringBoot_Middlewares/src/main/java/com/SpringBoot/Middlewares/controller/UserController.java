package com.SpringBoot.Middlewares.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBoot.Middlewares.entity.User;
import com.SpringBoot.Middlewares.service.UserService;
@RestController

public class UserController {
	
	@Autowired
	private UserService service;
	@PostMapping("/users/addUser")
	public User addProduct(@RequestBody User user) {
		return service.saveUser(user);
		
	}
	@GetMapping("/users/findAllUsers")
	public List<User> findAllUsers(){
		return service.getUsers();
	}

}
