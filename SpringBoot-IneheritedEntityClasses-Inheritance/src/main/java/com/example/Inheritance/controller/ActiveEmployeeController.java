package com.example.Inheritance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Inheritance.model.ActiveEmployee;
import com.example.Inheritance.service.ActiveEmployeeService;
@RestController
public class ActiveEmployeeController {

	@Autowired
	private ActiveEmployeeService activeEmployeeService;
	
	
	@PostMapping("/addActiveEmployee/Details")
	public ActiveEmployee add(@RequestBody ActiveEmployee activeEmployee)
	{
		return activeEmployeeService.add(activeEmployee);
	}
	@GetMapping("getActiveEmployee/{id}")
	public ActiveEmployee findActiveEmployeeById(@PathVariable int id){
		return activeEmployeeService.getActiveEmployeeById(id);
}
}