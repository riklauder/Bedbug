package com.bedbugs.springdemo.service;

import java.util.List;

import com.bedbugs.springdemo.entity.Student;

public interface StudentService {

	public List<Student> getStudents();

	public void saveStudent(Student theStudent);

	public Student getStudent(int theId);
	
	
}
