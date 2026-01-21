package com.example.projectfin.controller;


import com.example.projectfin.model.Course;
import com.example.projectfin.model.CourseRegistry;
import com.example.projectfin.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class  CourseController {
  @Autowired
  CourseService courseService;
  @GetMapping("/courses")
  public List<Course> availableCourse(){

    return courseService.availableMethod();
  }
  @GetMapping("/courses/enrolled")
  public List<CourseRegistry> enrolledStudents(){
    return courseService.enrolledStudents();
  }

  @PostMapping("/courses/register")
  public ResponseEntity<String> enrollCourse(CourseRegistry request) {
    courseService.enrollCourse(request);
    return ResponseEntity.ok("Enrollment successful");

  }


}
