package dev.farhan.springneo4j.controllers;

import java.security.Principal;
import java.util.List;

import dev.farhan.springneo4j.objects.CourseEnrolmentDTO;
import dev.farhan.springneo4j.queryresults.CourseEnrolmentQueryResult;
import dev.farhan.springneo4j.services.CourseEnrolmentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.farhan.springneo4j.models.Course;
import dev.farhan.springneo4j.requests.CourseEnrollmentRequest;

@RestController
@RequestMapping("/api/v1/enrollments")
public class CourseEnrollmentController {
    private final CourseEnrolmentService courseEnrolmentService;

    public CourseEnrollmentController(CourseEnrolmentService courseEnrolmentService) {
        this.courseEnrolmentService = courseEnrolmentService;
    }

    @GetMapping("/")
    public ResponseEntity<List<Course>> enrollments(Principal principal) {
        return new ResponseEntity<>(courseEnrolmentService.getAllEnrolledCoursesByUsername(principal.getName()), HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<CourseEnrolmentDTO> enrollIn(@RequestBody CourseEnrollmentRequest request, Principal principal) {
        CourseEnrolmentQueryResult enrolment = courseEnrolmentService.enrollIn(principal.getName(), request.getCourseIdentifier());

        CourseEnrolmentDTO responseEnrolment = new CourseEnrolmentDTO();

        responseEnrolment.setName(enrolment.getUser().getName());
        responseEnrolment.setUsername(enrolment.getUser().getUsername());
        responseEnrolment.setCourse(enrolment.getCourse());

        return new ResponseEntity<>(responseEnrolment, HttpStatus.OK);
    }
}
