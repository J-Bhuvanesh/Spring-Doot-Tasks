package com.example.ServiceWithInterface.Pagination.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ServiceWithInterface.Pagination.entity.Student;
import com.example.ServiceWithInterface.Pagination.service.IStudentService;
import com.example.ServiceWithInterface.Pagination.service.StudentService;
@RestController
public class StudentController {
	@Autowired
	private IStudentService iStudentService;
	@Autowired
	private StudentService studentService;
	@GetMapping("/student/{pageNo}/{pageSize}")
	public List<Student> getPaginated(@PathVariable int pageNo,@PathVariable int pageSize){
		return iStudentService.findPaginated(pageNo, pageSize);
	}
	
	
	@PostMapping("api/insert/all")
	public List<Student> saveProducts(@RequestBody List<Student> student) {
		return studentService.saveAll(student);
	}
	
	
	@PostMapping("insert/api/one")
	public Student setStudent(@RequestBody Student student) {
		return studentService.getStudent(student);
	}
}
