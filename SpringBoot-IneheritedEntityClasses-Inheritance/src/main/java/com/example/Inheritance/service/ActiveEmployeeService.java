package com.example.Inheritance.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Inheritance.model.ActiveEmployee;
import com.example.Inheritance.repository.ActiveEmployeeRepository;
@Service
public class ActiveEmployeeService {
	
	@Autowired
	private ActiveEmployeeRepository activeEmployeeRepository;
	
	
	public ActiveEmployee add(ActiveEmployee activeEmployee) {
		return activeEmployeeRepository.save(activeEmployee);
		
	}
	public ActiveEmployee getActiveEmployeeById(int id) {
		return (ActiveEmployee) activeEmployeeRepository.findById(id).orElse(null);
	}

}
