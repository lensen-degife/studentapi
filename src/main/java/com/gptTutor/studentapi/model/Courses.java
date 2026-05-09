package com.gptTutor.studentapi.model;

public class Courses {

    private int courseId;
    private String courseName;

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public Courses(int courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }


}
