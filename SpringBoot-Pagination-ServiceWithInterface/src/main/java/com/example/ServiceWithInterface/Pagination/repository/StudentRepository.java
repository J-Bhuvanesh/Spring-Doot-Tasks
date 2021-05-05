package com.example.ServiceWithInterface.Pagination.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.ServiceWithInterface.Pagination.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Integer>{

}
