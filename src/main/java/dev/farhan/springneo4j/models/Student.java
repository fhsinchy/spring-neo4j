package dev.farhan.springneo4j.models;

import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

@Node
public class Student {
    @Id
    private String username;
    private String password;
    @Relationship(type = "ENROLLED_IN")
    private List<Course> enrolledIn;

    public Student() {
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public List<HashMap<String, String>> getEnrolledIn() {
        return enrolledIn.stream().map(course -> {
            HashMap<String, String> c = new HashMap<>();

            c.put("title", course.getTitle());
            c.put("taughtBy", course.getTaughtBy());
            c.put("link", course.getLink());

            return c;
        }).collect(Collectors.toList());
    }
}
