package com.facebook.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.facebook.common.ResponseWrapper;
import com.facebook.model.User;
@Service
public interface IUserService {
	
	
	
	

	ResponseWrapper findfriends(Pageable pageable);
	
	
	

}
