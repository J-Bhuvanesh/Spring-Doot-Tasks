package com.SpringBoot.Middlewares.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBoot.Middlewares.entity.Product;
import com.SpringBoot.Middlewares.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository repository;
	
	public Product saveProduct(Product product) {
		return repository.save(product);
	}
	public List<Product> saveProducts(List<Product> products) {
		return repository.saveAll(products);
	}
	
	public List<Product> getProducts(){
		return repository.findAll();
	}
	public Product getProductById(int id){
		return repository.findById(id).orElse(null);
	}
}
