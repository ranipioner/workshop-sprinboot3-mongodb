package com.ranieri.workshopmongo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ranieri.workshopmongo.domain.Post;
import com.ranieri.workshopmongo.repository.PostRepository;
import com.ranieri.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {
	
	@Autowired
	private PostRepository repo;
	
	public Post findById(String id) { 
		 Optional<Post> obj = repo.findById(id); 
		 return obj.orElseThrow(() -> new ObjectNotFoundException("Object not found!")); 
		} 
	
	
}
