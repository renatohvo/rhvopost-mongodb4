package com.renatohvo.rhvopostmongodb4.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.renatohvo.rhvopostmongodb4.models.dto.UserDTO;
import com.renatohvo.rhvopostmongodb4.models.entities.User;
import com.renatohvo.rhvopostmongodb4.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<UserDTO> findAll() {
		List<User> list = repository.findAll();
		return list.stream().map(entity -> new UserDTO(entity)).collect(Collectors.toList());
	}
	
}
