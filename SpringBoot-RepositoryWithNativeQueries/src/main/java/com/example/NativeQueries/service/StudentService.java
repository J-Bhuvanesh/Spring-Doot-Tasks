package com.example.NativeQueries.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.NativeQueries.entity.Student;
import com.example.NativeQueries.repository.StudentRepository;
@Service
public class StudentService {
	@Autowired
	private StudentRepository studentRepository;
	
	public Student getStudent(Student student) {
		
		return (Student) studentRepository.save(student);
	}
	
	public List<Student> getAllStudent(){
		return studentRepository.findAllStudent();
	}
public int updateStudent(Student student) {
		
			Student exists=studentRepository.findById(student.getId()).orElse(null);
			exists.setName(student.getName());
		exists.setAge(student.getAge());
		String name=exists.getName();
		int id=exists.getId();
		return studentRepository.update(name,id);
	}
	

}
