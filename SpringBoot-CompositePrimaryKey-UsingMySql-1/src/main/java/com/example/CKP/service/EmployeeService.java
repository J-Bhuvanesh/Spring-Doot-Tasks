package com.example.CKP.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.CKP.entity.Employee;
import com.example.CKP.repository.EmployeeRepository;

@Service
public class EmployeeService {

	
	@Autowired
	private EmployeeRepository repository;
	public Employee save(Employee employee) {
		return repository.save(employee);
	}
	public List<Employee> findAll() {
		return repository.findAll();
	}
	public Employee findByEmail(String email) {
		// TODO Auto-generated method stub
		return repository.findByEmail(email);
	}

	
}
