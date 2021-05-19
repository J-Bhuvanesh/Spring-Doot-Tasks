package com.facebook.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.facebook.data.FriendsData;
import com.facebook.common.PaginationMeta;
import com.facebook.common.ResponseWrapper;
import com.facebook.model.User;
import com.facebook.repository.UserRepository;
@Service
public class UserServiceImpl implements IUserService{
	@Autowired
	private UserRepository userRepository;
	@Autowired
	ResponseWrapper responseWrapper;

	@Override
	public ResponseWrapper findfriends(Pageable pageable) {
	        Page<User> friendsPage = userRepository.findAll(pageable);

	        List<User> friends =  friendsPage.getContent();
	        PaginationMeta friendsPaginationMeta = PaginationMeta.createPagination(friendsPage);

	       FriendsData friendsData=new FriendsData();
	       friendsData.setUser(friends);
	       friendsData.setPagination(friendsPaginationMeta);

	       responseWrapper.setData(friendsData);
	        return responseWrapper;
	}



	

}
