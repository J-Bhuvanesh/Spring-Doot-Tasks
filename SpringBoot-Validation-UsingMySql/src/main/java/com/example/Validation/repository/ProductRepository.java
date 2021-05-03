package com.example.Validation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Validation.entity.Product;

@Repository

public interface ProductRepository extends JpaRepository<Product,Integer>{

	Product findByName(String name);

}