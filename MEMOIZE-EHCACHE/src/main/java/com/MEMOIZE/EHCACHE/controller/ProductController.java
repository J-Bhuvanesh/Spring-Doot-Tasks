package com.MEMOIZE.EHCACHE.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.MEMOIZE.EHCACHE.model.Product;
import com.MEMOIZE.EHCACHE.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService service;
	@PostMapping("/addProduct")
	public Product addProduct(@RequestBody Product product) {
		return service.saveProduct(product);
		
	}
	@PostMapping("/addProducts")
	public List<Product> addProducts(@RequestBody List<Product> products) {
		return service.saveProducts(products);
		
	}
	@GetMapping("/products")
	public List<Product> findAllProducts(){
		return service.getProducts();
	}
	@GetMapping("/productbyid")
	@Cacheable(value="ten-second-cache", key = "'ProductInCache'+#id", 
	condition = "#isCacheable != null && #isCacheable")
	public Product findAllProductsById(@RequestParam int id,@RequestParam boolean isCacheable){
		System.out.println("in cache...");
		return service.getProductById(id, isCacheable);
	}

}
