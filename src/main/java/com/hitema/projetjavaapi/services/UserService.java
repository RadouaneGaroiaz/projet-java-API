package com.hitema.projetjavaapi.services;


import com.hitema.projetjavaapi.entities.User;

import java.util.List;

public interface UserService {
    User create(User user);
    User read(Long id);
    List<User> readAll();
    User update(User user);
    void delete(Long id);
}
