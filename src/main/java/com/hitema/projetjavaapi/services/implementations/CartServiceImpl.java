package com.hitema.projetjavaapi.services.implementations;

import com.hitema.projetjavaapi.entities.Cart;
import com.hitema.projetjavaapi.repositories.CartRepository;
import com.hitema.projetjavaapi.services.CartService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class CartServiceImpl implements CartService {

    private final CartRepository cartRepository;

    @Override
    public Cart create(Cart cart) {
        return cartRepository.save(cart);
    }

    @Override
    public Cart read(String id) {
        return cartRepository.findById(id).orElse(null);
    }

    @Override
    public Cart update(Cart cart) {
        return cartRepository.save(cart);
    }

    @Override
    public List<Cart> readAll() {
        return cartRepository.findAll();
    }

    @Override
    public void delete(String id) {
        cartRepository.deleteById(id);
    }
}
