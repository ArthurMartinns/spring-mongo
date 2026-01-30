package com.arthur.mongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arthur.mongo.domain.User;
import com.arthur.mongo.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	public UserRepository userRepository;
	
	public List<User> findaAll() {
		return userRepository.findAll();
	}
 }
