package com.MultiProfiles.ResponseEntity.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.MultiProfiles.ResponseEntity.entity.Product;
import com.MultiProfiles.ResponseEntity.service.ProductService;



@RestController
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	
	@Value("${spring.message}")
	private String message;
	@GetMapping("/Greetings-default")
	public ResponseEntity<String> Hello() {
		return new ResponseEntity<String>(message,HttpStatus.ACCEPTED);
		
	}
	
	@PostMapping("/addProduct")
	public ResponseEntity<Product> addProduct(@RequestBody Product product) {
		return  new ResponseEntity<Product>(service.saveProduct(product),HttpStatus.OK);
		
	}
	@PostMapping("/addProducts")
	public ResponseEntity<List<Product>> addProducts(@RequestBody List<Product> products) {
		return new ResponseEntity<List<Product>>(service.saveProducts(products),HttpStatus.ACCEPTED);
		
	}
	@GetMapping("/products")
	public ResponseEntity<List<Product>> findAllProducts(){
		return  new ResponseEntity<List<Product>>(service.getProducts(),HttpStatus.ACCEPTED);
	}
	@GetMapping("/productbyid/{id}")
	public ResponseEntity<Product> findAllProductsById(@PathVariable int id){
		return  new ResponseEntity<Product>(service.getProductById(id),HttpStatus.ACCEPTED);
	}
	@GetMapping("/product/{name}")
	public ResponseEntity<Product> findAllProductsByName(@PathVariable String name){
		return  new ResponseEntity<Product>(service.getProductByName(name),HttpStatus.ACCEPTED);
	}
	@PutMapping("/update")
	public ResponseEntity<Product> updateProduct(@RequestBody Product product) {
		return  new ResponseEntity<Product>(service.updateProduct(product),HttpStatus.ACCEPTED);
		
	}
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteProduct(@PathVariable int id) {
		return  new ResponseEntity<String>(service.deleteProduct(id),HttpStatus.ACCEPTED);
		
	}
	


	

}
