package com.facebook.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.facebook.common.ResponseWrapper;
import com.facebook.excetion.NoSuchIdFountException;
import com.facebook.model.AccountProfile;
import com.facebook.model.User;
import com.facebook.repository.AccountProfileRepository;
@Service
public class AccountProfileServiceImpl implements IAccountProfileService{
	
	@Autowired
	private AccountProfileRepository repository;
	@Autowired
	ResponseWrapper responseWrapper;
	public ResponseWrapper saveProfile(AccountProfile profile) {
		responseWrapper.setData(repository.save(profile));
		return responseWrapper;
	}
	public ResponseWrapper getAllProfiles(){
		responseWrapper.setData(repository.findAll());
		return responseWrapper;
	}
	public ResponseWrapper getAccountProfilesById(int id){
		
		responseWrapper=findFunction(id);
		return responseWrapper;
	}
	public ResponseWrapper deleteAccountProfilesById(int id) {
		responseWrapper=findDeleteFunction(id);
		return responseWrapper;
	}
	
	private  ResponseWrapper findFunction(int id) {
		
		boolean exists=repository.existsById(id);
		if(!exists)
		{
			throw new NoSuchIdFountException("500","input field id is not present");
			
		}
		else 
			responseWrapper.setData(repository.findById(id));
		return responseWrapper;
		
	}
	private ResponseWrapper findDeleteFunction(int id) {
		boolean exists=repository.existsById(id);
		if(!exists)
		{
			throw new NoSuchIdFountException("500","input field id is not present to delete data");
			
		}
		else {
			repository.deleteById(id);
			responseWrapper.setData("the profile is deleted");
		}		return responseWrapper;
	}


}
