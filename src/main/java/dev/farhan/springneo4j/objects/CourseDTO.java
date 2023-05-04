package dev.farhan.springneo4j.objects;

import dev.farhan.springneo4j.models.Lesson;
import java.util.Set;
import java.util.HashSet;

public class CourseDTO {
    private String identifier;
    private String title;
    private String taughtBy;
    private Set<Lesson> lessons = new HashSet<>();
    private boolean isEnrolled;
    
    public CourseDTO() {
    }

    public CourseDTO(String identifier, String title, String taughtBy, Set<Lesson> lessons) {
        this.identifier = identifier;
        this.title = title;
        this.taughtBy = taughtBy;
        this.lessons = lessons;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTaughtBy() {
        return taughtBy;
    }

    public void setTaughtBy(String taughtBy) {
        this.taughtBy = taughtBy;
    }

    public Set<Lesson> getLessons() {
        return lessons;
    }

    public void setLessons(Set<Lesson> lessons) {
        this.lessons = lessons;
    }

    public boolean isEnrolled() {
        return isEnrolled;
    }

    public void setEnrolled(boolean isEnrolled) {
        this.isEnrolled = isEnrolled;
    }

    
        
}
