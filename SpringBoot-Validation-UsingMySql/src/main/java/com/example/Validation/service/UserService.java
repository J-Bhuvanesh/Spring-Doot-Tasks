package com.example.Validation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Validation.user.entity.User;
import com.example.Validation.user.repository.UserRepository;


@Service
public class UserService {

	@Autowired
	private UserRepository repository1;
	
	public User saveFeedBack(User user) {
		return repository1.save(user);
	}
	public List<User> getAllFeedBack(){
		return repository1.findAll();
	}
	public User getFeedBackById(int id){
		return repository1.findById(id).orElse(null);
	}
}
