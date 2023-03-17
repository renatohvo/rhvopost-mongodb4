package com.renatohvo.rhvopostmongodb4.config;

import java.util.Arrays;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.renatohvo.rhvopostmongodb4.models.entities.User;
import com.renatohvo.rhvopostmongodb4.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig {
	
	@Autowired
	private UserRepository userRepository;
	
	@PostConstruct
	public void init() {
		userRepository.deleteAll();

		User maria = new User(null, "Maria Brown", "maria@maria.com");
		User alex = new User(null, "Alex Green", "alex@alex.com");
		User bob = new User(null, "Bob Grey", "bob@bob.com");

		userRepository.saveAll(Arrays.asList(maria, alex, bob));
	}
}
