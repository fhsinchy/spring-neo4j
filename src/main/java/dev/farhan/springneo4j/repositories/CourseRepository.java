package dev.farhan.springneo4j.repositories;

import dev.farhan.springneo4j.models.Course;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends Neo4jRepository<Course, String> {
}
