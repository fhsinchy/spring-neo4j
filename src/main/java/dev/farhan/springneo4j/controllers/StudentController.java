package dev.farhan.springneo4j.controllers;

import dev.farhan.springneo4j.models.Student;
import dev.farhan.springneo4j.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping
    public ResponseEntity<List<Student>> studentIndex() {
        return new ResponseEntity<>(studentService.getAllStudents(), HttpStatus.OK);
    }
}
