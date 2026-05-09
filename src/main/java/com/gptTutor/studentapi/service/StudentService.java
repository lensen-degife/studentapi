package com.gptTutor.studentapi.service;

import com.gptTutor.studentapi.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    private final List<Student> students = new ArrayList<>();
    public StudentService() {
        students.add(  new Student(1, "Abel", "Spring boot"));
        students.add( new Student(2, "Sara", "React"));
        students.add(new Student(3, "John", "Python"));
    }
    public List<Student> getStudents(){

        return students;

    }

    public Student getStudentById( int id) {
        return students.stream()
                .filter(s -> s.getId() ==id)
                .findFirst()
                .orElse(null);

    }

    public Student addStudent(Student student){
        students.add(student);
        return student;
    }

    public Student updateStudent(int id, Student updatedStudent){
        Student existing = getStudentById(id);
        if (existing != null){
            existing.setName(updatedStudent.getName());
            existing.setCourse(updatedStudent.getCourse());
            return existing;
        }
        return null;
    }
    public String deleteStudent(int id) {
        Student student = getStudentById(id);

        if(student != null){
            students.remove(student);
            return "student deleted successfully";
        }
        return "Student not found";
    }

}
