package dev.farhan.springneo4j.controllers;

import java.security.Principal;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.farhan.springneo4j.models.Course;
import dev.farhan.springneo4j.requests.CourseEnrollmentRequest;
import dev.farhan.springneo4j.services.UserService;

@RestController
@RequestMapping("/api/v1/enrollments")
public class CourseEnrollmentController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public ResponseEntity<Set<Course>> enrollments(Principal principal) {
        return new ResponseEntity<>(userService.getUserByUserName(principal.getName()).getEnrollments(), HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<Course> enrollIn(@RequestBody CourseEnrollmentRequest request, Principal principal) {
        Course course = userService.enrollIn(request.getCourseIdentifier(), principal.getName());

        return new ResponseEntity<Course>(course, HttpStatus.OK);
    }
}
