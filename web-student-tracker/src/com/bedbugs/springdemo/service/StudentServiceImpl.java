
package com.bedbugs.springdemo.service;

import java.util.List;

import com.bedbugs.springdemo.dao.StudentDAO;
import com.bedbugs.springdemo.entity.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service

public class StudentServiceImpl implements StudentService {

	
	@Autowired

	private StudentDAO studentDAO;
	
	
	@Override
	@Transactional
	public List <Student> getStudents(){
	
		return studentDAO.getStudents();
	
	}


	@Override
	@Transactional
	public void saveStudent(Student theStudent) {
		
		studentDAO.saveStudent(theStudent);
		
		
		
	}


	@Override
	@Transactional
	public Student getStudent(int theId) {
		// TODO Auto-generated method stub
		
		
		return studentDAO.getStudent(theId);
	}}

