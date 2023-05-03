package dev.farhan.springneo4j.models;

import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Node
public class Teacher {
    @Id
    private String name;
    @Relationship(type = "TEACHES")
    private List<Course> teaches;

    public Teacher() {
    }

    public String getName() {
        return name;
    }

    public List<Map<String, String>> getTeaches() {
        return teaches.stream().map(course -> {
            HashMap<String, String> c = new HashMap<>();

            c.put("title", course.getTitle());

            return c;
        }).collect(Collectors.toList());
    }
}
