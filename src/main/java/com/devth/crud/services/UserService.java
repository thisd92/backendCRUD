package com.devth.crud.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devth.crud.entities.User;
import com.devth.crud.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public User saveUser(User user) {
		return userRepository.save(user);
	}
	
	public List<User> findAll(){
		return userRepository.findAll();
	}
	
	public Optional<User> findById(Long id){
		return userRepository.findById(id);
	}
	
	public User updateUser(Long id, User user) {
		User entity = userRepository.getReferenceById(id);
		updateData(entity, user);
		return userRepository.save(entity);
	}
	
	public void updateData(User entity,  User user) {
		entity.setNome(user.getNome());
		entity.setEmail(user.getEmail());
		entity.setNome(user.getNome());
		entity.setTel(user.getTel());
		entity.setCep(user.getCep());
		entity.setEndereco(user.getEndereco());
		entity.setNumero(user.getNumero());
		entity.setCidade(user.getCidade());
		entity.setUf(user.getUf());
	}
	
	public void deleteUser(Long id) {
		userRepository.deleteById(id);
	}
	
}
