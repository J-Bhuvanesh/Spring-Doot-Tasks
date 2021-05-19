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
import com.facebook.model.Group;
import com.facebook.service.IGroupService;
@RestController
public class GroupController {
	
	@Autowired
	private IGroupService service;
	@PostMapping("/createGroup")
	public ResponseWrapper addGroup(@Valid @RequestBody Group group) {
		ResponseWrapper responseWrapper=service.saveGroup(group);
		return responseWrapper;
	}
	@GetMapping("/seeGroups/details/api")
	public ResponseWrapper findAllGroups(){
		ResponseWrapper responseWrapper=service.getGroups();
		return responseWrapper;
	}
	@GetMapping("find/groups/id/api/{id}")
	public ResponseWrapper findGroupsById(@PathVariable int id) {
		ResponseWrapper responseWrapper=service.findGroupsById(id);
		return responseWrapper;
	}
	@DeleteMapping("delete/group/name/{name}")
	public ResponseWrapper deleteGroup(@PathVariable String name) {
		ResponseWrapper responseWrapper=service.deleteGroupByName(name);
		return responseWrapper;
	}
	
}
