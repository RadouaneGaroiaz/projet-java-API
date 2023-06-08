package com.hitema.projetjavaapi.controllers;

import com.hitema.projetjavaapi.entities.User;
import com.hitema.projetjavaapi.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService service;

    @GetMapping({"/","/all"})
    public List<User> getAll(){
        return service.readAll();
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id){
        return service.read(id);
    }

    @PostMapping
    public ResponseEntity addUser(@RequestBody User user) {
        service.create(user);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping
    public ResponseEntity updateUser(@RequestBody User user) {
        service.update(user);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
