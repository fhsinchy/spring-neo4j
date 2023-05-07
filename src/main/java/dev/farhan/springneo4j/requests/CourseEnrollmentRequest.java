package dev.farhan.springneo4j.requests;

public class CourseEnrollmentRequest {
    private String courseIdentifier;

    public CourseEnrollmentRequest() {
    }

    public String getCourseIdentifier() {
        return courseIdentifier;
    }

    public void setCourseIdentifier(String courseIdentifier) {
        this.courseIdentifier = courseIdentifier;
    }
}
