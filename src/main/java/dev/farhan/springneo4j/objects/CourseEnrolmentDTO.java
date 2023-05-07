package dev.farhan.springneo4j.objects;

import dev.farhan.springneo4j.models.Course;

public class CourseEnrolmentDTO {
    private String name;
    private String username;
    private Course course;

    public CourseEnrolmentDTO() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
