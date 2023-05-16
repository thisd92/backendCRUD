package com.devth.crud.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.devth.crud.entities.User;
import com.devth.crud.repositories.UserRepository;

@Service
public class UserService {

	private UserRepository userRepository;
	
	public List<User> findAll(){
		List<User> userList = userRepository.findAll();
		return userList;
	}
	
	
}
