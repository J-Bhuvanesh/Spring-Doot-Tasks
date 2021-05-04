package com.example.Validation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Validation.entity.Product;
import com.example.Validation.exception.EmptyInputException;
import com.example.Validation.exception.NoSuchIdFountException;
import com.example.Validation.repository.ProductRepository;



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
	public Product getProductById(String id){
		
		if(id.isEmpty()) {
			throw new NoSuchIdFountException("398","input field id is empty");
		}
		return repository.findById(Integer.valueOf(id)).orElseThrow(null);
	
		}
	public Product getProductByName(String name){
		if(name.isEmpty()) {
			throw new EmptyInputException("399","input field name is empty");
		}
		return repository.findByName(name);
	}
	public String deleteProduct(int id) {
		repository.deleteById(id);
		return "product deleted "+id;
	}
	public Product updateProduct(Product product) {
		Product existingProduct=repository.findById(product.getId()).orElse(null);
		existingProduct.setName(product.getName());
		existingProduct.setQuantity(product.getQuantity());
		existingProduct.setPrice(product.getPrice());
		return repository.save(existingProduct);
		
	}
	
	

}