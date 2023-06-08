package com.hitema.projetjavaapi.services;


import com.hitema.projetjavaapi.entities.Cart;

import java.util.List;

public interface CartService {
    Cart create(Cart cart);
    Cart read(String id);
    Cart update(Cart cart);
    List<Cart> readAll();
    void delete(String id);
}
