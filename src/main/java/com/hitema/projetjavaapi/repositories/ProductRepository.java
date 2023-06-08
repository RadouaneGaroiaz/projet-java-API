package com.hitema.projetjavaapi.repositories;

import com.hitema.projetjavaapi.entities.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends MongoRepository<Product,String> {
    List<Product> findByCategory(String category);
}
