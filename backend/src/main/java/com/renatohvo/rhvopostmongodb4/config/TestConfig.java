package com.renatohvo.rhvopostmongodb4.config;

import java.time.Instant;
import java.util.Arrays;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.renatohvo.rhvopostmongodb4.models.embedded.Author;
import com.renatohvo.rhvopostmongodb4.models.embedded.Comment;
import com.renatohvo.rhvopostmongodb4.models.entities.Post;
import com.renatohvo.rhvopostmongodb4.models.entities.User;
import com.renatohvo.rhvopostmongodb4.repositories.PostRepository;
import com.renatohvo.rhvopostmongodb4.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PostRepository postRepository;
	
	@PostConstruct
	public void init() {
		userRepository.deleteAll();
		postRepository.deleteAll();

		User maria = new User(null, "Maria Brown", "maria@maria.com");
		User alex = new User(null, "Alex Green", "alex@alex.com");
		User bob = new User(null, "Bob Grey", "bob@bob.com");

		userRepository.saveAll(Arrays.asList(maria, alex, bob));
		
		Post post1 = new Post(null, Instant.parse("2023-02-13T11:15:01Z"), "Viagem!", "Vou viajar para Recife. Abraços!", new Author(maria));
		Post post2 = new Post(null, Instant.parse("2023-02-14T10:05:49Z"), "Bom dia!", "Hoje eu acordei feliz!", new Author(maria));

		Comment c1 = new Comment("Boa viagem!", Instant.parse("2023-02-13T14:30:01Z"), new Author(alex));
		Comment c2 = new Comment("Aproveite!", Instant.parse("2023-02-13T15:38:05Z"), new Author(bob));
		Comment c3 = new Comment("Tenha um ótimo dia!", Instant.parse("2023-02-14T12:34:26Z"), new Author(alex));

		post1.getComments().addAll(Arrays.asList(c1, c2));
		post2.getComments().addAll(Arrays.asList(c3));

		postRepository.saveAll(Arrays.asList(post1, post2));

		maria.getPosts().addAll(Arrays.asList(post1, post2));
		userRepository.save(maria);	
	}
}
