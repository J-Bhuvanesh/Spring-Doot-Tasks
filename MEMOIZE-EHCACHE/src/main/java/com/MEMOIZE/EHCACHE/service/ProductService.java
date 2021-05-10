package com.MEMOIZE.EHCACHE.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.MEMOIZE.EHCACHE.model.Product;
import com.MEMOIZE.EHCACHE.repository.ProductRepository;



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
	
	public Product getProductById(int id,boolean isCacheable){
		System.out.println("in db...");
		return repository.findById(id).orElse(null);
	}


}
