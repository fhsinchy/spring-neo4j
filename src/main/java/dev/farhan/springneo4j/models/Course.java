package dev.farhan.springneo4j.models;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

@Node
public class Course {
    @Id
    private String title;
    private String link;
    @Relationship(type = "TEACHES", direction = Relationship.Direction.INCOMING)
    private Teacher taughtBy;

    public Course() {
    }


    public String getTitle() {
        return title;
    }

    public String getLink() {
        return link;
    }

    public String getTaughtBy() {
        return taughtBy.getName();
    }
}
