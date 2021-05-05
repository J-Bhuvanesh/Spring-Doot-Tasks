package com.example.ServiceWithInterface.Pagination.service;
import java.util.List;


import org.springframework.stereotype.Service;

import com.example.ServiceWithInterface.Pagination.entity.Student;
@Service
public interface IStudentService {
	
	List<Student> findPaginated(int pageNo,int pageSize);

}
