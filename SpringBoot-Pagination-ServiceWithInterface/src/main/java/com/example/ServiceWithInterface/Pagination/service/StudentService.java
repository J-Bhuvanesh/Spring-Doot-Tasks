package com.example.ServiceWithInterface.Pagination.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.ServiceWithInterface.Pagination.entity.Student;
import com.example.ServiceWithInterface.Pagination.repository.StudentRepository;
@Service
public class StudentService implements IStudentService{
	
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public List<Student> findPaginated(int pageNo, int pageSize) {
		
		Pageable paging=PageRequest.of(pageNo, pageSize);
		Page<Student> pagedResult=studentRepository.findAll(paging);
		return pagedResult.toList();
	}

	public Student getStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}

	public List<Student> saveAll(List<Student> student) {
		// TODO Auto-generated method stub
		return studentRepository.saveAll(student);
	}

}
