package com.arthur.mongo.config;

import java.util.Arrays;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.arthur.mongo.domain.Post;
import com.arthur.mongo.domain.User;
import com.arthur.mongo.dto.AuthorDTO;
import com.arthur.mongo.repositories.PostRepository;
import com.arthur.mongo.repositories.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner{
		
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PostRepository postRepository;

	@Override
	public void run(String... args) throws Exception {
		
		
		userRepository.deleteAll();	
		
		User maria = new User(null, "Maria Brown", "maria@gmail.com");
		User alex = new User(null, "Alex Green", "alex@gmail.com");
		User bob = new User(null, "Bob Grey", "bob@gmail.com");
		
		userRepository.saveAll(Arrays.asList(maria, alex, bob));
		
		Post post1 = new Post(null, new Date(), "Teste", "Texto do body", new AuthorDTO(maria));
		Post post2 = new Post(null, new Date(), "Teste", "Texto do body", new AuthorDTO(maria));
		
		postRepository.saveAll(Arrays.asList(post1, post2));
		
		maria.getPosts().addAll(Arrays.asList(post1, post2));
		userRepository.save(maria);
	}

}
