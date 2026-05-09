package com.gptTutor.studentapi.service;

import com.gptTutor.studentapi.model.Courses;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {



    public List<Courses> courses = new ArrayList<>();

   public CourseService(){
       courses.add( new Courses(1, "Spring framework"));
       courses.add( new Courses(2, "Hibernate ORM"));
       courses.add(      new Courses(3, "Quarks"));

    }



    public Courses addCourse(Courses course) {
        courses.add(course);
        return  course;
    }

    public List<Courses> getCourses() {
       return courses;
    }
    public Courses updateCourses(int id, Courses updatedCourse){
       Courses existing = getCourseById(id);
       if (existing != null){
           existing.setCourseName(updatedCourse.getCourseName());
           return existing;
       }
       return null;
    }

    public Courses getCourseById(int id) {
       return courses.stream()
               .filter(c -> c.getCourseId() ==id)
               .findFirst()
               .orElse(null);
    }
    public String deleteCourse(int id){
       Courses courses1 = getCourseById(id);

       if (courses1 != null){
           courses.remove(courses1);
           return "successfully deleted";
       }
       return "course not found";
    }
}
