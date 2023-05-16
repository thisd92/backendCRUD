package com.devth.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.devth.crud.entities.User;
import com.devth.crud.services.UserService;

public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping
	public List<User> findAll(){
		List<User> userList = userService.findAll();
		return userList;
	}
	
	
}
