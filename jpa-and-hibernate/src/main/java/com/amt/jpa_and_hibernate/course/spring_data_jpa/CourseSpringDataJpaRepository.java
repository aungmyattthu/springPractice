package com.amt.jpa_and_hibernate.course.spring_data_jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amt.jpa_and_hibernate.course.Course;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long>{
	List<Course> findByAuthor(String author);
	List<Course> findByName(String name);
}
