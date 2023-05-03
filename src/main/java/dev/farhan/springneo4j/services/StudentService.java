package dev.farhan.springneo4j.services;

import dev.farhan.springneo4j.models.Student;
import dev.farhan.springneo4j.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Optional<Student> getStudentByUsername(String username) {
        return studentRepository.findStudentByUsername(username);
    }
}
