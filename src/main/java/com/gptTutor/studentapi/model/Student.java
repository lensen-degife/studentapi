package com.gptTutor.studentapi.model;

public class Student {

    private String name;
    private int id;
    private String course;

    public Student( int id, String name, String course) {
        this.name = name;
        this.id = id;
        this.course = course;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }
}
