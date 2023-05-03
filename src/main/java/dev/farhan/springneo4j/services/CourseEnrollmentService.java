package dev.farhan.springneo4j.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import dev.farhan.springneo4j.models.Course;
import dev.farhan.springneo4j.models.User;
import dev.farhan.springneo4j.repositories.CourseRepository;
import dev.farhan.springneo4j.repositories.UserRepository;

@Service
public class CourseEnrollmentService {
    
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private CourseRepository courseRepository;
    
    public boolean getEnrollmentStatus(String username, String courseIdentifier) {
        User user = userRepository.findUserByUsername(username).orElseThrow(() -> new ResponseStatusException(HttpStatusCode.valueOf(404)));
        Course course = courseRepository.findCourseByIdentifier(courseIdentifier).orElseThrow(() -> new ResponseStatusException(HttpStatusCode.valueOf(404)));

        return user.getEnrollments().contains(course);
    }
}
