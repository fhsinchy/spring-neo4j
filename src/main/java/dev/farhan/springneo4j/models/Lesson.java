package dev.farhan.springneo4j.models;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

@Node
public class Lesson {
    @Id @GeneratedValue
    private Long id;
    private String identifier;
    private String title;
    @Relationship(type = "BELONGS_TO")
    private Course course;

    public Lesson() {
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getTitle() {
        return title;
    }

    public Course getCourse() {
        return course;
    }
}
