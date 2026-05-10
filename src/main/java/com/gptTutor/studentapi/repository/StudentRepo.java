package com.gptTutor.studentapi.repository;

import com.gptTutor.studentapi.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, Integer> {


}
