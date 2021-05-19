package com.facebook.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.facebook.common.ResponseWrapper;
import com.facebook.model.User;
import com.facebook.service.IUserService;

@RestController
public class UserController {
	
	@Autowired
	private IUserService iUserService;
	

    @GetMapping("find/friends")
    private ResponseWrapper getAuthors(@PageableDefault(size=5) Pageable pageable){

    	ResponseWrapper responseWrapper=iUserService.findfriends(pageable);
		return responseWrapper;
    }


}
