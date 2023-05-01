package dev.farhan.springneo4j.services;

import dev.farhan.springneo4j.models.User;
import dev.farhan.springneo4j.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;
    public Collection<User> getAll() {
        return userRepository.getAllUsers();
    }
}
