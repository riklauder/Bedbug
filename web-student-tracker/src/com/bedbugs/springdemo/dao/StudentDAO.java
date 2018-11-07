package com.bedbugs.springdemo.dao;


import java.util.List;

import com.bedbugs.springdemo.entity.Student;

public interface StudentDAO {

	public List<Student> getStudents();

	public void saveStudent(Student theStudent);

	public Student getStudent(int theId);
	
	
}
