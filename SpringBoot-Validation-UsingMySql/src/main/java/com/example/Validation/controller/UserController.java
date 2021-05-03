package com.example.Validation.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Validation.service.UserService;
import com.example.Validation.user.entity.User;

@RestController
public class UserController {
	
	
	@Autowired
	private UserService service1;
	@PostMapping("/addUserFeedBack")
	public User addFeedBack(@RequestBody User user) {
		return service1.saveFeedBack(user);
		
	}
	
	@GetMapping("/allFeedBack")
	public List<User> findAllFeedBack(){
		return service1.getAllFeedBack();
	}
	@GetMapping("/feedBackByid/{id}")
	public User findAllFeedBackById(@PathVariable int id){
		return service1.getFeedBackById(id);
	}

}
