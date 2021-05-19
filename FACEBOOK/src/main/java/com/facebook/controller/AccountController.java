package com.facebook.controller;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.facebook.common.ResponseWrapper;
import com.facebook.model.Account;
import com.facebook.service.IAccountService;
@RestController
public class AccountController {
	@Autowired
	private IAccountService service;
	@PostMapping("/createAccount")
	public ResponseWrapper createAccount(@Valid @RequestBody Account account) {

		ResponseWrapper responseWrapper=service.saveAccounts(account);
		return responseWrapper;
	}
	@GetMapping("/seeAccount/details/api")
	public ResponseWrapper getAccounts(){
		ResponseWrapper responseWrapper=service.getAccounts();
		return responseWrapper;
	}
	@GetMapping("/seeAccount/details/api/{id}")
	public ResponseWrapper getAccountById(@Valid @PathVariable int id) {
		ResponseWrapper responseWrapper=service.getAccountById(id);
		return responseWrapper;
		
	}
	
	@DeleteMapping("/delete/account/{id}")
	public ResponseWrapper deleteProfile(@PathVariable int id) {
		return service.deleteAccountById(id);
		
	}
	
	
}
