package com.hitema.projetjavaapi.controllers;

import com.hitema.projetjavaapi.entities.Cart;
import com.hitema.projetjavaapi.services.CartService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carts")
@RequiredArgsConstructor
public class CartController {
    private final CartService service;

    @GetMapping({"/"})
    public List<Cart> getAll(){
        return service.readAll();
    }

    @GetMapping("/{id}")
    public Cart getCart(@PathVariable String id){
        return service.read(id);
    }

    @PostMapping
    public ResponseEntity addCart(@RequestBody Cart cart) {
        service.create(cart);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping
    public ResponseEntity updateCart(@RequestBody Cart cart) {
        service.update(cart);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteCart(@PathVariable String id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
