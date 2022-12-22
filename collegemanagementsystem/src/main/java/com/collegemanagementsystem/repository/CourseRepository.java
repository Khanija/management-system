package com.collegemanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.collegemanagementsystem.domain.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course,Long> {

}
