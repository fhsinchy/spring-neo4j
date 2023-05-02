package dev.farhan.springneo4j.repositories;

import dev.farhan.springneo4j.models.Teacher;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends Neo4jRepository<Teacher, String> {
}
