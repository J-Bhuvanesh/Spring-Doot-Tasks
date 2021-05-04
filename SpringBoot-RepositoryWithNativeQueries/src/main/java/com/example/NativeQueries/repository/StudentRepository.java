package com.example.NativeQueries.repository;

import java.util.List;

import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.NativeQueries.entity.Student;

@Transactional
public interface StudentRepository extends JpaRepository<Student,Integer>{
	
	
	
	@Query(value="SELECT * FROM student",nativeQuery = true)
	List<Student> findAllStudent();
	
	@Modifying
	@Query(value="update student s set s.name = :name where s.id = :id",nativeQuery = true)
	int update(@Param("name") String name,@Param("id") int id);

}
