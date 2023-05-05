package dev.farhan.springneo4j.controllers;

import dev.farhan.springneo4j.models.Course;
import dev.farhan.springneo4j.objects.CourseDTO;
import dev.farhan.springneo4j.services.CourseService;
import dev.farhan.springneo4j.services.CourseEnrollmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/courses")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @Autowired
    private CourseEnrollmentService courseEnrollmentService;

    @GetMapping("/")
    public ResponseEntity<List<CourseDTO>> courseIndex(Principal principal) {

        List<Course> courses = courseService.getAllCourses();

        List<CourseDTO> responseCourses = courses.stream().map(
                (course) -> new CourseDTO(course.getIdentifier(), course.getTitle(), course.getTaughtBy(), course.getLessons())
        ).collect(Collectors.toList());

        return new ResponseEntity<>(responseCourses, HttpStatus.OK);

    }

    @GetMapping("/{identifier}")
    public ResponseEntity<CourseDTO> courseDetails(@PathVariable String identifier, Principal principal) {
        Course course = courseService.getCourseByIdentifier(identifier);
        CourseDTO responseCourse = new CourseDTO();

        responseCourse.setTitle(course.getTitle());
        responseCourse.setTaughtBy(course.getTaughtBy());
        responseCourse.setLessons(course.getLessons());

        if (principal != null)
            responseCourse.setEnrolled(courseEnrollmentService.getEnrollmentStatus(principal.getName(), identifier));

        return new ResponseEntity<>(responseCourse, HttpStatus.OK);
    }
}
