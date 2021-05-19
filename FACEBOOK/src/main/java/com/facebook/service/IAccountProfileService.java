package com.facebook.service;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.facebook.common.ResponseWrapper;
import com.facebook.model.AccountProfile;
import com.facebook.model.User;
@Service
public interface IAccountProfileService {
	
	

	ResponseWrapper saveProfile(AccountProfile profile);
	
	ResponseWrapper getAccountProfilesById(int id);
	
	ResponseWrapper getAllProfiles();

	ResponseWrapper deleteAccountProfilesById(int id);


}
