package com.example.projectfin.repository;

import com.example.projectfin.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepo  extends JpaRepository<Course,String> {
}
