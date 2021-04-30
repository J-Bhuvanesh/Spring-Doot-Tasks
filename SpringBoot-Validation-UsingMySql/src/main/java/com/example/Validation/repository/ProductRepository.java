package com.example.Validation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Validation.entity.Product;



public interface ProductRepository extends JpaRepository<Product,Integer>{

	Product findByName(String name);

}