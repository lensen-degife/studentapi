package com.gptTutor.studentapi.repository;

import com.gptTutor.studentapi.model.Courses;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepo extends JpaRepository<Courses, Integer> {
}
