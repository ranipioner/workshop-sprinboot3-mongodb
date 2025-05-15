package com.ranieri.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ranieri.workshopmongo.domain.Post;

public interface PostRepository extends MongoRepository<Post, String>{

}
