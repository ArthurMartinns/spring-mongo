package com.arthur.mongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.arthur.mongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{

}
