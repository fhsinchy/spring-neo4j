package dev.farhan.springneo4j.controllers;

import dev.farhan.springneo4j.models.Course;
import dev.farhan.springneo4j.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/courses")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @GetMapping
    public List<Course> courseIndex() {
        return courseService.getAllCourses();
    }
}
