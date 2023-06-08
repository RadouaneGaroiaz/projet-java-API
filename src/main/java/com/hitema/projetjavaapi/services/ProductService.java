package com.hitema.projetjavaapi.services;


import com.hitema.projetjavaapi.entities.Product;

import java.util.List;

public interface ProductService {
    Product create(Product product);
    Product read(String id);
    List<Product> readAll();
    Product update(Product product);
    void delete(String id);
    List<Product> getByCategory(String category);
}
