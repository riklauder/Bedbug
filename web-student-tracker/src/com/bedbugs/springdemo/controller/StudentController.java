package com.bedbugs.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bedbugs.springdemo.dao.StudentDAO;
import com.bedbugs.springdemo.entity.Student;
import com.bedbugs.springdemo.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	// need to inject the customer dao
@Autowired
private StudentService studentService;
	
	
	

	
@GetMapping("/list")
public String listStudent(Model theModel) {
	
	
	// get customers from the service
	
	
	List<Student> theStudents = studentService.getStudents();
	
	//add the customers to the model

	theModel.addAttribute("students", theStudents);
	
	
	return "list-students";
}


@GetMapping("/showFormForApp")
public String showFormForAdd(Model theModel)
{
	
	Student theStudent = new Student();
	
	theModel.addAttribute("student", theStudent);
	
	

	return "students-form";
	
}
	
@PostMapping("/saveStudent")
public String saveStudent(@ModelAttribute("student") Student theStudent)
{

	studentService.saveStudent(theStudent);
	
	return "redirect:/student/list";
	
}

@GetMapping ("/showFormForUpdate")
public String showForForUpdate(@RequestParam("studentId")int theId, Model theModel) {
	
	//get the student from the db
	
	Student theStudent = studentService.getStudent(theId);
	
	
	// set the student as a model attribute
	
	theModel.addAttribute("student",theStudent);
	
	
	// send to form
	
	return "students-form";
}
	

}
