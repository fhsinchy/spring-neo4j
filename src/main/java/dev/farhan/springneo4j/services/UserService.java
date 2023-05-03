package dev.farhan.springneo4j.services;

import dev.farhan.springneo4j.models.Course;
import dev.farhan.springneo4j.models.User;
import dev.farhan.springneo4j.repositories.CourseRepository;
import dev.farhan.springneo4j.repositories.UserRepository;
import dev.farhan.springneo4j.requests.CreateUserRequest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    
    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public User getUserByUserName(String username){
        return userRepository.findUserByUsername(username)
                .orElseThrow(() -> new ResponseStatusException(HttpStatusCode.valueOf(404)));
    };

    public User createUser(CreateUserRequest request) {
        User user = new User();

        user.setName(request.getName());
        user.setUsername(request.getUsername());
        user.setRoles(request.getRoles());
        user.setPassword(passwordEncoder.encode(request.getPassword()));

        userRepository.save(user);

        return user;
    }

    public List<Course> getEnrollments(String username) {
        return userRepository.findEnrollmentsByUsername(username);
    }

    public void enrollIn(String courseIdentifier, String username) {
        User user = userRepository.findUserByUsername(username).orElseThrow(() -> new ResponseStatusException(HttpStatusCode.valueOf(404)));
        Course course = courseRepository.findCourseByIdentifier(courseIdentifier).orElseThrow(() -> new ResponseStatusException(HttpStatusCode.valueOf(404)));

        user.setEnrollments(course);

        userRepository.save(user);

    }
}
