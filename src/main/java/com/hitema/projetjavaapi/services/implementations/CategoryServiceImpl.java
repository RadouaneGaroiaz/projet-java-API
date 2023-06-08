package com.hitema.projetjavaapi.services.implementations;

import com.hitema.projetjavaapi.entities.Category;
import com.hitema.projetjavaapi.repositories.CategoryRepository;
import com.hitema.projetjavaapi.services.CategoryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    @Override
    public Category create(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public Category read(Long id) {
        return categoryRepository.findById(id.toString()).orElse(null);
    }

    @Override
    public List<Category> readAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Category update(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public void delete(Long id) {
        categoryRepository.deleteById(id.toString());
    }
}
