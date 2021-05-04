package com.example.NativeQueries.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.NativeQueries.entity.Student;
import com.example.NativeQueries.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@PostMapping("insert")
	public Student addStudent(@RequestBody Student student) {
		return studentService.getStudent(student);
	}
	
	@GetMapping("findAll")
	public List<Student> findAllStudent() {
		return studentService.getAllStudent();
	}
	@PutMapping("/update")
	public int updateProduct(@RequestBody Student student) {
		return studentService.updateStudent(student);
		
	}
}
