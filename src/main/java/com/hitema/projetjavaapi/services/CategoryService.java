package com.hitema.projetjavaapi.services;


import com.hitema.projetjavaapi.entities.Category;

import java.util.List;

public interface CategoryService {
    Category create(Category category);
    Category read(Long id);
    List<Category> readAll();
    Category update(Category category);
    void delete(Long id);
}
