package com.facebook.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.facebook.common.ResponseWrapper;
import com.facebook.excetion.NoSuchIdFountException;
import com.facebook.excetion.NoSuchNameNotFoundException;
import com.facebook.model.Group;
import com.facebook.repository.GroupRepository;
@Transactional
@Service
public class GroupServiceImpl implements  IGroupService{
	@Autowired
	private GroupRepository repository;
	@Autowired
	ResponseWrapper responseWrapper;
	public ResponseWrapper saveGroup(Group group) {
		responseWrapper.setData(repository.save(group));
		return responseWrapper;
	}
	public ResponseWrapper getGroups(){
		responseWrapper.setData(repository.findAll());
		return responseWrapper;
	}
	
	public ResponseWrapper findGroupsById(int id) {
		
		responseWrapper=findFunction(id);
		return responseWrapper;
	}
	
	public ResponseWrapper deleteGroupByName(String name) {
		responseWrapper=findDeleteFunction(name);
		return responseWrapper;
	}
	
	private ResponseWrapper findDeleteFunction(String name) {
		boolean exists=repository.existsByGroupName(name);
		if(!exists)
			throw new NoSuchNameNotFoundException("500","input field group name with the group is not present");
		else {
			repository.deleteByGroupName(name);
			responseWrapper.setData("group is deleted with the name "+name);
		}return responseWrapper;
	}
	private ResponseWrapper findFunction(int id) {
		
		boolean exists=repository.existsById((long) id);
		if(!exists)
		{
			throw new NoSuchIdFountException("500","input field id with the group is not present");
		}
		else 
			responseWrapper.setData(repository.findById((long) id));
		return responseWrapper;
	}
}
