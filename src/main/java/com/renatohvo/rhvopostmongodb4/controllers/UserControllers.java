package com.renatohvo.rhvopostmongodb4.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.renatohvo.rhvopostmongodb4.models.dto.UserDTO;
import com.renatohvo.rhvopostmongodb4.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserControllers {
	
	@Autowired
	private UserService service;
	
	@GetMapping
	public ResponseEntity<List<UserDTO>> findAll() {
		List<UserDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
}
