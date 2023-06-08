package com.hitema.projetjavaapi.controllers;

import com.hitema.projetjavaapi.entities.Category;
import com.hitema.projetjavaapi.services.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
@RequiredArgsConstructor
public class CategoryController {
    private final CategoryService service;

    @GetMapping({"/"})
    public List<Category> getAll(){
        return service.readAll();
    }

    @GetMapping("/{id}")
    public Category getCategory(@PathVariable Long id){
        return service.read(id);
    }

    @PostMapping
    public ResponseEntity addCategory(@RequestBody Category category) {
        service.create(category);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping
    public ResponseEntity updateCategory(@RequestBody Category category) {
        service.update(category);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteCategory(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
