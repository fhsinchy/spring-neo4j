package dev.farhan.springneo4j.objects;

import dev.farhan.springneo4j.models.Lesson;

import java.util.ArrayList;
import java.util.List;

public class CourseDTO {
    private String identifier;
    private String title;
    private String teacher;
    private List<Lesson> lessons = new ArrayList<>();
    private boolean isEnrolled;

    public CourseDTO() {
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

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public List<Lesson> getLessons() {
        return lessons;
    }

    public void setLessons(List<Lesson> lessons) {
        this.lessons = lessons;
    }

    public boolean isEnrolled() {
        return isEnrolled;
    }

    public void setEnrolled(boolean enrolled) {
        isEnrolled = enrolled;
    }
}
