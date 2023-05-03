package dev.farhan.springneo4j.controllers;

import dev.farhan.springneo4j.models.Course;
import dev.farhan.springneo4j.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/courses")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @GetMapping
    public ResponseEntity<List<Course>> courseIndex() {
        return new ResponseEntity<>(courseService.getAllCourses(), HttpStatus.OK);

    }

    @GetMapping("/{identifier}")
    public ResponseEntity<Optional<Course>> courseDetails(@PathVariable String identifier) {
        return new ResponseEntity<>(courseService.getCourseByIdentifier(identifier), HttpStatus.OK);
    }

}
