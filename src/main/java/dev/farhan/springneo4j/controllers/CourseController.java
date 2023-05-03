package dev.farhan.springneo4j.controllers;

import dev.farhan.springneo4j.models.Course;
import dev.farhan.springneo4j.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/courses")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @GetMapping("/")
    public ResponseEntity<List<Course>> courseIndex() {
        return new ResponseEntity<>(courseService.getAllCourses(), HttpStatus.OK);

    }

    @GetMapping("/{identifier}")
    public ResponseEntity<Course> courseDetails(@PathVariable String identifier) {
        return new ResponseEntity<>(courseService.getCourseByIdentifier(identifier), HttpStatus.OK);
    }
}
