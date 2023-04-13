package com.renatohvo.rhvopostmongodb4.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.renatohvo.rhvopostmongodb4.models.dto.UserDTO;
import com.renatohvo.rhvopostmongodb4.services.UserService;

import io.swagger.annotations.Api;

@RestController
@RequestMapping(value = "/users")
@Api(tags = "User Controller", value = "UserController", description = "Controller for Users")
public class UserController {
	
	@Autowired
	private UserService service;
	
	@GetMapping
	public ResponseEntity<List<UserDTO>> findAll() {
		List<UserDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<UserDTO> findById(@PathVariable String id) {
		UserDTO obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
