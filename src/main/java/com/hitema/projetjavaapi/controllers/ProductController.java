package com.hitema.projetjavaapi.controllers;

import com.hitema.projetjavaapi.entities.Product;
import com.hitema.projetjavaapi.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService service;

    @GetMapping({"/"})
    public List<Product> getAll(){
        return service.readAll();
    }

    @GetMapping("/{id}")
    public Product getProduct(@PathVariable Long id){
        return service.read(id);
    }

    @PostMapping
    public ResponseEntity addProduct(@RequestBody Product product) {
        service.create(product);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping
    public ResponseEntity updateProduct(@RequestBody Product product) {
        service.update(product);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteProduct(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
