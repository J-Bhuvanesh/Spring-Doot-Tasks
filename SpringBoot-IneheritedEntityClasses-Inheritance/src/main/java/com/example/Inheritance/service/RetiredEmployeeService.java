package com.example.Inheritance.service;

import org.springframework.stereotype.Service;



import org.springframework.beans.factory.annotation.Autowired;


import com.example.Inheritance.model.RetiredEmployee;
import com.example.Inheritance.repository.RetiredEmployeeRepository;

@Service
public class RetiredEmployeeService {
	
	@Autowired
	private RetiredEmployeeRepository retiredEmployeeRepository;
	
	
	public RetiredEmployee add(RetiredEmployee retiredEmployee) {
		return retiredEmployeeRepository.save(retiredEmployee);
		
	}
	public RetiredEmployee getRetiredEmployeeById(int id) {
		return (RetiredEmployee) retiredEmployeeRepository.findById(id).orElse(null);
	}


}
