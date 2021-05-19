package com.facebook.service;

import org.springframework.stereotype.Service;

import com.facebook.common.ResponseWrapper;
import com.facebook.model.Account;
@Service
public interface IAccountService {
	ResponseWrapper saveAccounts(Account account);

	ResponseWrapper getAccounts();
	
	ResponseWrapper getAccountById(int id);
	

	ResponseWrapper deleteAccountById(int id);



}
