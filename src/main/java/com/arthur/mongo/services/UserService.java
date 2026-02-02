package com.arthur.mongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arthur.mongo.domain.User;
import com.arthur.mongo.repositories.UserRepository;
import com.arthur.mongo.services.exception.ObjectNotFoundException;

@Service
public class UserService {
	
	@Autowired
	public UserRepository userRepository;
	
	public List<User> findaAll() {
		return userRepository.findAll();
	}
	
	public User findById(String id) {
	    return userRepository.findById(id)
	        .orElseThrow(() -> new ObjectNotFoundException("Usuário não encontrado!"));
	}

 }
