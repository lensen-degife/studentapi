package com.gptTutor.studentapi.service;

import com.gptTutor.studentapi.model.Student;
import com.gptTutor.studentapi.repository.StudentRepo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    StudentRepo repo;

    public List<Student> getStudents(){

        return repo.findAll();

    }

    public Student getStudentById( int id) {
      return repo.findById(id).orElse(new Student());

    }

    public Student addStudent(Student student){
        return repo.save(student);
    }

    public Student updateStudent(int id, Student updatedStudent){
//        Student existing = getStudentById(id);
//        if (existing != null){
//            existing.setName(updatedStudent.getName());
//            existing.setCourse(updatedStudent.getCourse());
//            return existing;
//        }
//        return null;
        return repo.save(updatedStudent);
    }
    public String deleteStudent(int id) {
//        Student student = getStudentById(id);
//
//        if(student != null){
//            students.remove(student);
//            return "student deleted successfully";
//        }
//        return "Student not found";
         repo.deleteById(id);
         return "successfully deleted";
    }

}
