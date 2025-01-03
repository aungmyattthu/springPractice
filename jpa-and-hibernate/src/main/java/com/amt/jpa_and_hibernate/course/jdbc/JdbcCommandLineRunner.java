package com.amt.jpa_and_hibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.amt.jpa_and_hibernate.course.Course;
import com.amt.jpa_and_hibernate.course.spring_data_jpa.CourseSpringDataJpaRepository;

@Component
public class JdbcCommandLineRunner implements CommandLineRunner{
//	@Autowired
//	private CourseJdbcRepository repository;
//	@Autowired
//	private CourseJpaRepository repository;
	@Autowired
	private CourseSpringDataJpaRepository repository;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		repository.insert(new Course(1, "Spring Fundamental", "In28min"));
//		repository.insert(new Course(2, "AWS Fundamental", "In28min"));
//		repository.insert(new Course(3, "Microservice Fundamental", "In28min"));
//		
//		repository.deleteById(1);
//		
//		System.out.println(repository.selectById(2));
//		System.out.println(repository.selectById(3));
		
		repository.save(new Course(1, "Spring Fundamental", "In28min"));
		repository.save(new Course(2, "AWS Fundamental", "In28min"));
		repository.save(new Course(3, "Microservice Fundamental", "amt"));
		
		repository.deleteById(1l);
//		System.out.println(repository.findAll());
		System.out.println(repository.findById(2l));
		System.out.println(repository.findById(3l));
		
		System.out.println(repository.findByAuthor("amt"));
		System.out.println(repository.findByName("AWS Fundamental"));
	}

}
