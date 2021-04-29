package com.example.O2M.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.O2M.DTO.OrderResponse;
import com.example.O2M.entity.Customer;


public interface CustomerRepository extends JpaRepository<Customer,Integer>{
	
	@Query("SELECT new com.example.O2M.DTO.OrderResponse(c.name ,c.gender, p.productName,p.price) FROM Customer c JOIN c.products p")
	public List<OrderResponse> getJoinInformation();

}
