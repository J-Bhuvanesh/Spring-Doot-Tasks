package com.example.CKP.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.CKP.entity.Employee;
import com.example.CKP.service.EmployeeService;

@RestController
public class EmployeeController {
	
	
	
	@Autowired
	private EmployeeService service;
	

    @PostMapping("/employee")
    public Employee save(@RequestBody Employee employee) {
        return service.save(employee);
    }
    @GetMapping("find/employee/{email}")
    public Employee findByEmail(@PathVariable String email) {
        return service.findByEmail(email);
    }
    @GetMapping("/employee/findAll")
    public List<Employee> findAll() {
        return service.findAll();
    }
}
