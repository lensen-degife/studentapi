package com.gptTutor.studentapi.controller;

import com.gptTutor.studentapi.model.Student;
import com.gptTutor.studentapi.service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    @GetMapping("/students")
    public List<Student> getStudents(){
        return studentService.getStudents();
    }
    @GetMapping("/students/{id}")
    public Student getStudentById(@PathVariable int id){
        return studentService.getStudentById(id);
    }

    @GetMapping("/students/search")
    public String searchStudenta(@RequestParam String course){
        return "Searching students in " + course;
    }
    @PostMapping("/students")
    public Student addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }

    @PutMapping("/students/{id}")
    public Student updateStudent(@PathVariable int id, @RequestBody Student student){

        return studentService.updateStudent(id, student);
    }
    @DeleteMapping("/students/{id}")
//    public String deleteStudent(@PathVariable int id){
//        return studentService.deleteStudent(id);
//    }
    public ResponseEntity<String> deleteStudent(
            @PathVariable int id
    ) {
        String response = studentService.deleteStudent(id);
        return ResponseEntity.ok(response);
    }


}
