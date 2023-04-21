package com.renatohvo.rhvopostmongodb4.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.renatohvo.rhvopostmongodb4.models.dto.PostDTO;
import com.renatohvo.rhvopostmongodb4.services.PostService;

import io.swagger.annotations.Api;

@RestController
@RequestMapping(value = "/posts")
@Api(tags = "Post Controller", value = "PostController", description = "Controller for Posts")
public class PostController {
	
	@Autowired
	private PostService service;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<PostDTO> findById(@PathVariable String id) {
		PostDTO obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@GetMapping(value = "/titlesearch")
	public ResponseEntity<List<PostDTO>> findByTitle(@RequestParam(value = "text", defaultValue = "") String text) {
		List<PostDTO> list = service.findByTitle(text);
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value="/fullsearch")
 	public ResponseEntity<List<PostDTO>> fullSearch(
 			@RequestParam(value="text", defaultValue="") String text,
 			@RequestParam(value="start", defaultValue="") String start,
 			@RequestParam(value="end", defaultValue="") String end) {
		List<PostDTO> list = service.fullSearch(text, start, end);
		return ResponseEntity.ok().body(list);
	}
}
