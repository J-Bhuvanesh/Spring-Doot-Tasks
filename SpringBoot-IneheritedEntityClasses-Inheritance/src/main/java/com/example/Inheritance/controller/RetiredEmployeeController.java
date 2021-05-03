package com.example.Inheritance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Inheritance.model.RetiredEmployee;
import com.example.Inheritance.service.RetiredEmployeeService;

@RestController
public class RetiredEmployeeController {
	
	@Autowired
	private RetiredEmployeeService retiredEmployeeService;
	
	
	@PostMapping("/addRetiredEmployee/Details")
	public RetiredEmployee add(@RequestBody RetiredEmployee retiredEmployee)
	{
		return retiredEmployeeService.add(retiredEmployee);
	}
	@GetMapping("getRetiredEmployee/{id}")
	public RetiredEmployee findRetiredEmployeeById(@PathVariable int id){
		return retiredEmployeeService.getRetiredEmployeeById(id);
}

}
