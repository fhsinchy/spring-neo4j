package dev.farhan.springneo4j.models;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

@Node
public class Course {
    @Id
    private String identifier;
    private String title;
    @Relationship(type = "TEACHES", direction = Relationship.Direction.INCOMING)
    private Teacher taughtBy;
    @Relationship(type = "PART_OF", direction = Relationship.Direction.INCOMING)
    private List<Lesson> lessons;

    public Course() {
    }


    public String getTitle() {
        return title;
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getTaughtBy() {
        return taughtBy.getName();
    }

    public List<HashMap<String, String >> getLessons() {
        return lessons.stream().map(lesson -> {
            HashMap<String, String> l = new HashMap<>();

            l.put("title", lesson.getTitle());
            l.put("identifier", lesson.getIdentifier());

            return l;
        }).collect(Collectors.toList());
    }
}
