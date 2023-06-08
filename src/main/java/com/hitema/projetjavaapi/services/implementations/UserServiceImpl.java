package com.hitema.projetjavaapi.services.implementations;

import com.hitema.projetjavaapi.entities.User;
import com.hitema.projetjavaapi.repositories.UserRepository;
import com.hitema.projetjavaapi.services.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public User create(User user) {
        return userRepository.save(user);
    }

    @Override
    public User read(Long id) {
        return userRepository.findById(id.toString()).orElse(null);
    }

    @Override
    public List<User> readAll() {
        return userRepository.findAll();
    }

    @Override
    public User update(User user) {
        return userRepository.save(user);
    }

    @Override
    public void delete(Long id) {
        userRepository.deleteById(id.toString());
    }
}
