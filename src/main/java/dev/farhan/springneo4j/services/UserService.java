package dev.farhan.springneo4j.services;

import dev.farhan.springneo4j.models.User;
import dev.farhan.springneo4j.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public Optional<User> getUserByUserName(String username){
        return userRepository.findUserByUsername(username);
    };
}
