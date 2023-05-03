package dev.farhan.springneo4j.services;

import dev.farhan.springneo4j.models.Course;
import dev.farhan.springneo4j.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    public Optional<Course> getCourseByIdentifier(String identifier) {
        return  courseRepository.findCourseByIdentifier(identifier);
    }
}
