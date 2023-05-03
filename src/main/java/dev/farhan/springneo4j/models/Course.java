package dev.farhan.springneo4j.models;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.HashSet;
import java.util.Set;

@Node
public class Course {
    @Id @GeneratedValue
    private Long id;
    private String identifier;
    private String title;
    @Relationship(type = "TAUGHT_BY")
    private User taughtBy;
    @Relationship(type = "BELONGS_TO", direction = Relationship.Direction.INCOMING)
    private Set<Lesson> lessons = new HashSet<>();

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

    public Set<Lesson> getLessons() {
        return lessons;
    }

    // public List<HashMap<String, String >> getLessons() {
    //     return lessons.stream().map(lesson -> {
    //         HashMap<String, String> l = new HashMap<>();

    //         l.put("title", lesson.getTitle());
    //         l.put("identifier", lesson.getIdentifier());

    //         return l;
    //     }).collect(Collectors.toList());
    // }
}
