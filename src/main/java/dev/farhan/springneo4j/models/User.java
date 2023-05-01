package dev.farhan.springneo4j.models;

import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.List;

@Node
public class User {
    @Id
    private Long id;
    private String name;
    private Integer age;
    @Relationship(type = "RATED", direction = Relationship.Direction.INCOMING)
    private List<Movie> movies;

    public User() {
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}
