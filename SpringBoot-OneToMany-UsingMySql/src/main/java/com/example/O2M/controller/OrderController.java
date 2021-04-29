package com.example.O2M.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.O2M.DTO.OrderRequest;
import com.example.O2M.DTO.OrderResponse;
import com.example.O2M.entity.Customer;
import com.example.O2M.repository.CustomerRepository;
import com.example.O2M.repository.ProductRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class OrderController {
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private ProductRepository productRepository;
    @PostMapping("/placeOrder")
    public Customer placeOrder(@RequestBody OrderRequest request) {
		return customerRepository.save(request.getCustomer());
    	
    }
    @GetMapping("/findAllOrders")
    public List<Customer> findAllOrders(){
        return customerRepository.findAll();
    }
    @GetMapping("/getInfo")
    public List<OrderResponse> getInformation(){
        return customerRepository.getJoinInformation();
    }

	

}
