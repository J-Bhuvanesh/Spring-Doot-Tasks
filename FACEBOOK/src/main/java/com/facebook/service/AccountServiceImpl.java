package com.facebook.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.facebook.common.ResponseWrapper;
import com.facebook.excetion.NoSuchIdFountException;
import com.facebook.model.Account;
import com.facebook.repository.AccountRepository;
@Service
public class AccountServiceImpl implements IAccountService{
	@Autowired
	private AccountRepository repository;
	@Autowired
	ResponseWrapper responseWrapper;

	@Override
	public ResponseWrapper saveAccounts(Account account) {
		responseWrapper.setData(repository.save(account));
		return responseWrapper;
	}
	@Override
	public ResponseWrapper getAccounts(){
		
		responseWrapper.setData(repository.findAll());
		return responseWrapper;
	}
	@Override
	public ResponseWrapper getAccountById(int id){
		
		responseWrapper=findFunction(id);
		return responseWrapper;
	}
	@Override
	public ResponseWrapper deleteAccountById(int id) {
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
			responseWrapper.setData("the account is deleted");
		}		return responseWrapper;
	}
	

}
