package com.example.projectfin.service;

import com.example.projectfin.model.Course;
import com.example.projectfin.model.CourseRegistry;
import com.example.projectfin.repository.CourseRegistryRepo;
import com.example.projectfin.repository.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    CourseRepo courseRepo ;
    @Autowired
    CourseRegistryRepo courseRegistryRepo;

    public List<Course> availableMethod() {
     return courseRepo.findAll();
    }

    public List<CourseRegistry> enrolledStudents() {
        return courseRegistryRepo.findAll();
    }
    public void enrollCourse(CourseRegistry request) {
        courseRegistryRepo.save(request);
    }


}