package com.example.Inheritance.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

import com.example.Inheritance.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer>{

	

}
