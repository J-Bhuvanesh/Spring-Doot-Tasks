package com.example.O2M.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.O2M.entity.Product;


public interface ProductRepository extends JpaRepository<Product,Integer>{

}

