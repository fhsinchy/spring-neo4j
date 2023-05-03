package dev.farhan.springneo4j.models;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.HashMap;

@Node
public class Lesson {
    @Id @GeneratedValue
    private Long id;
    private String identifier;
    private String title;
    @Relationship(type = "PART_OF")
    private Course course;

    public Lesson() {
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getTitle() {
        return title;
    }

    public HashMap<String, String> getCourse() {
        HashMap<String, String> c = new HashMap<>();

        c.put("title", course.getTitle());
        c.put("identifier", course.getIdentifier());

        return c;
    }
}
