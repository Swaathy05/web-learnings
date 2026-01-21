package com.example.projectfin.repository;

import com.example.projectfin.model.CourseRegistry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CourseRegistryRepo extends JpaRepository<CourseRegistry,Integer> {

}
