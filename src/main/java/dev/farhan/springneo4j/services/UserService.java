package dev.farhan.springneo4j.services;

import dev.farhan.springneo4j.models.Course;
import dev.farhan.springneo4j.models.User;
import dev.farhan.springneo4j.queryresults.CourseEnrolmentQueryResult;
import dev.farhan.springneo4j.repositories.UserRepository;
import dev.farhan.springneo4j.requests.CreateUserRequest;

import org.springframework.http.HttpStatusCode;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    private final PasswordEncoder passwordEncoder;

    public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public User createUser(CreateUserRequest request) {
        User user = new User();

        user.setName(request.getName());
        user.setUsername(request.getUsername());
        user.setRoles(request.getRoles());
        user.setPassword(passwordEncoder.encode(request.getPassword()));

        userRepository.save(user);

        return user;
    }
}
