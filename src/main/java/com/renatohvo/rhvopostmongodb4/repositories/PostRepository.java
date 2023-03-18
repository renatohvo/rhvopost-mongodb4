package com.renatohvo.rhvopostmongodb4.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.renatohvo.rhvopostmongodb4.models.entities.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}
