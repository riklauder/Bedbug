package com.bedbugs.springdemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bedbugs.springdemo.entity.Student;
@Repository

public class StudentDAOImpl implements StudentDAO {
// need to inject the session factory
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Student> getStudents() {
		
		
// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		
		
// create a query

		Query<Student> theQuery = currentSession.createQuery("from Student", Student.class);
		
//executing query and get result list
		
		List<Student> students = theQuery.getResultList();
		
		

// return the results		
		
		return students;
		
		
	}

	@Override
	public void saveStudent(Student theStudent) {
		// get the session hibernate
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		currentSession.save(theStudent);
		
		
		// save the student into the database
		
		
		
		
	}

	@Override
	public Student getStudent(int theId) {
		// get the current hibernate session
		
		
		Session currentSession = sessionFactory.getCurrentSession();
		
	
	
		// retrive object from database
		Student theStudent = currentSession.get(Student.class, theId);
		
		return theStudent;
	}

}



