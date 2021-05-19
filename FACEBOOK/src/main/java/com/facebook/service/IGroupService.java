package com.facebook.service;



import org.springframework.stereotype.Service;

import com.facebook.common.ResponseWrapper;
import com.facebook.model.Group;

@Service
public interface IGroupService {
	
	ResponseWrapper saveGroup(Group group);

	ResponseWrapper getGroups();


	ResponseWrapper deleteGroupByName(String name);


	ResponseWrapper findGroupsById(int id);



}
