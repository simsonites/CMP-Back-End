package com.softpager.cmp.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.softpager.cmp.entities.Student;
import com.softpager.cmp.services.CourseService;
import com.softpager.cmp.services.StudentService;

@RestController
@RequestMapping("/api")
public class StudentController {
	
	private StudentService studentService;	
	
	private CourseService courseService;
	
	
	@Autowired
	public StudentController(StudentService studentService, CourseService courseService) {	
		this.studentService = studentService;
		this.courseService = courseService;
	}
	
	@GetMapping("/students")
	public Page<Student> getStudents(@RequestParam(defaultValue= "0")int page){
		 return studentService.getStudents( PageRequest.of(page, 5));
	}
	
	@GetMapping("/students/{id}")
	public Optional<Student> getStudent(@PathVariable("id") long sId){
		 return studentService.getStudent(sId);
	}
	
	@PostMapping("/students")
	public void addStudent(@RequestBody Student theStudent) {
		theStudent.setId(0);
		studentService.addStudent(theStudent);		
	}
	
	@PutMapping("/students")
	public void updateStudent(@RequestBody Student theStudent) {
		studentService.updateStudent(theStudent);		
	}
	
	@DeleteMapping("/students/{studentId}")
	public void deleteStudent(@PathVariable("studentId")  long theId) {
		studentService.deleteStudent(theId);		
	}


}



























