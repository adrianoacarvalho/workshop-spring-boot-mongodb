package com.curso.workshopmongo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.workshopmongo.domain.Post;
import com.curso.workshopmongo.domain.User;
import com.curso.workshopmongo.dto.UserDTO;
import com.curso.workshopmongo.repository.PostRepository;
import com.curso.workshopmongo.repository.UserRepository;
import com.curso.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {
	
	@Autowired
	private PostRepository repo;
	
	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
	
}
