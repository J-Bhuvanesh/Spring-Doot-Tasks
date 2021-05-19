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
import com.facebook.model.AccountProfile;
import com.facebook.service.IAccountProfileService;
@RestController
public class AccountProfileController {
	
	@Autowired
	private IAccountProfileService service;
	@PostMapping("/createAccountProfile")
	public ResponseWrapper addProfile(@Valid @RequestBody AccountProfile profile) {
		ResponseWrapper responseWrapper=service.saveProfile(profile);
		return responseWrapper;
	}
	@GetMapping("/seeAccountProfile/details/api")
	public ResponseWrapper getAccountProfileInform(){
		ResponseWrapper responseWrapper=service.getAllProfiles();
		return responseWrapper;
	}
	@GetMapping("/seeAccountProfile/details/api/{id}")
	public ResponseWrapper getAccountProfilesById(@Valid @PathVariable int id) {
		ResponseWrapper responseWrapper=service.getAccountProfilesById(id);
		return responseWrapper;
		
	}
	@DeleteMapping("/delete/profile/{id}")
	public ResponseWrapper deleteProfile(@PathVariable int id) {
		return service.deleteAccountProfilesById(id);
		
	}

}
