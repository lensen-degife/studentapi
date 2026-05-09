package com.gptTutor.studentapi.controller;

import com.gptTutor.studentapi.model.Courses;
import com.gptTutor.studentapi.service.CourseService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {

    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping("/courses")
    public List<Courses> getCourses(){
        return courseService.getCourses();
    }
    @PostMapping("/courses")
    public Courses addCourse(@RequestBody Courses courses){
        return courseService.addCourse(courses);
    }

}
