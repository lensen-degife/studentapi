package com.gptTutor.studentapi.service;

import com.gptTutor.studentapi.model.Courses;
import com.gptTutor.studentapi.repository.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {


    @Autowired
    CourseRepo repo;
   // public List<Courses> courses = new ArrayList<>();

   public CourseService(){

   }
    public List<Courses> getCourses() {
       return repo.findAll();
    }



    public Courses addCourse(Courses course) {
        //courses.add(course);
        return  repo.save(course);
    }

//    public List<Courses> getCourses() {
//       return courses;
//    }
    public Courses updateCourses(int id, Courses updatedCourse){
//       Courses existing = getCourseById(id);
//       if (existing != null){
//           existing.setCourseName(updatedCourse.getCourseName());
//           return existing;
//       }
       return repo.save(updatedCourse);
    }

   public Courses getCourseById(int id) {
//       return courses.stream()
//               .filter(c -> c.getCourseId() ==id)
//               .findFirst()
//               .orElse(null);
       return repo.findById(id).orElse(new Courses());
    }
    public String deleteCourse(int id){
//       Courses courses1 = getCourseById(id);
//
//       if (courses1 != null){
//           courses.remove(courses1);
//           return "successfully deleted";
//       }
        repo.deleteById(id);
       return "course not found";
    }


}
