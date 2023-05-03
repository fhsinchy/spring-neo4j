package dev.farhan.springneo4j.repositories;

import dev.farhan.springneo4j.models.Student;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends Neo4jRepository<Student, String> {
    Optional<Student> findStudentByUsername(String username);
}
