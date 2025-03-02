package org.example.userbooking.service;

import org.example.userbooking.model.User;
import org.example.userbooking.repository.UserRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;


@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) { this.userRepository = userRepository; }

    public Flux<User> getAllUsers() { return userRepository.findAll(); }
}