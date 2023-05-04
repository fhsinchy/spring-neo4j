package dev.farhan.springneo4j.models;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Node
public class Lesson {
    @Id @GeneratedValue
    private Long id;
    private String identifier;
    private String title;

    public Lesson() {
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getTitle() {
        return title;
    }
}
