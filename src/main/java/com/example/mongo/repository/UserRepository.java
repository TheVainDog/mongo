package com.example.mongo.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.mongo.document.User;

@Repository
public interface UserRepository extends MongoRepository <User, String>{
	User findBy_id(ObjectId _id);
}
