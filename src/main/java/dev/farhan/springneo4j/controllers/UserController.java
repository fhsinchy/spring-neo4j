package dev.farhan.springneo4j.controllers;

import dev.farhan.springneo4j.models.User;
import dev.farhan.springneo4j.requests.CreateUserRequest;
import dev.farhan.springneo4j.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@RestController
@RequestMapping("/api/v1/auth")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/me")
    public String loggedInUserDetails(Principal principal) {
        return principal.getName();
    }

    @PostMapping("/register")
    public ResponseEntity<User> signUp(@RequestBody CreateUserRequest request) {
        User user = userService.createUser(request);

        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }
}
