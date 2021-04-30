package com.example.CKP.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.example.CKP.entity.*;

public interface EmployeeRepository extends JpaRepository<Employee,EmployeeCPKId>{

	Employee findByEmail(String email);

}
