package com.gptTutor.studentapi.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Courses {

    @Id
    private int courseId;
    private String courseName;

    public Courses() {

    }

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
