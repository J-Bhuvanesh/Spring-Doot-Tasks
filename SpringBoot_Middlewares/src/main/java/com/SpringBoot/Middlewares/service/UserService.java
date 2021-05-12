package com.SpringBoot.Middlewares.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBoot.Middlewares.entity.User;
import com.SpringBoot.Middlewares.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public User saveUser(User user) {
		return repository.save(user);
	}
	

	public List<User> getUsers(){
		return repository.findAll();
	}
	
	
}
