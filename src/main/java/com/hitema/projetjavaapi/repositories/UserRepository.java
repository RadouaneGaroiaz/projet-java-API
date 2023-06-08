package com.hitema.projetjavaapi.repositories;

import com.hitema.projetjavaapi.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User,String> {
}
