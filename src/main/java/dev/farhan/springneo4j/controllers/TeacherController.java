package dev.farhan.springneo4j.controllers;

import dev.farhan.springneo4j.models.Teacher;
import dev.farhan.springneo4j.services.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/teachers")
public class TeacherController {
    @Autowired
    TeacherService teacherService;

    @GetMapping
    public ResponseEntity<List<Teacher>> teacherIndex() {
        return new ResponseEntity<>(teacherService.getAllTeachers(), HttpStatus.OK);
    }
}
