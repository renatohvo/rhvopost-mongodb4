package com.renatohvo.rhvopostmongodb4.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.renatohvo.rhvopostmongodb4.models.dto.PostDTO;
import com.renatohvo.rhvopostmongodb4.models.entities.Post;
import com.renatohvo.rhvopostmongodb4.repositories.PostRepository;
import com.renatohvo.rhvopostmongodb4.services.exceptions.ResourceNotFoundException;

@Service
public class PostService {
	
	@Autowired
	private PostRepository repository;
	
	public PostDTO findById(String id) {
		Post entity = getEntityById(id);
		return new PostDTO(entity);
	}
	
	private Post getEntityById(String id) {
		Optional<Post> result = repository.findById(id);
		return result.orElseThrow(() -> new ResourceNotFoundException("Objeto não encontrado."));
	}
}
