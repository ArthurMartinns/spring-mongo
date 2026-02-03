package com.arthur.mongo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arthur.mongo.domain.Post;
import com.arthur.mongo.repositories.PostRepository;
import com.arthur.mongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {
	
	@Autowired
	public PostRepository postRepository;
	
	public Post findById(String id) {
	    return postRepository.findById(id)
	        .orElseThrow(() -> new ObjectNotFoundException("Post não encontrado!"));
	}

 }
