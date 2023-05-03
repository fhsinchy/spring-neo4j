package dev.farhan.springneo4j.repositories;

import dev.farhan.springneo4j.models.Course;
import dev.farhan.springneo4j.models.User;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends Neo4jRepository<User, Long> {
    Optional<User> findUserByUsername(String username);
    
    @Query("MATCH (u:User)-[:ENROLLED_IN]->(c:Course) WHERE u.username = {$username} RETURN c.title")
    List<Course> findEnrollmentsByUsername(@Param("username") String username);
}
