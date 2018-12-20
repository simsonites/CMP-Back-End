package com.softpager.icmp.controllers;

import java.util.List;
import java.util.ListIterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.softpager.icmp.entities.Course;
import com.softpager.icmp.entities.Student;
import com.softpager.icmp.services.CourseService;
import com.softpager.icmp.services.StudentService;

@RestController
@RequestMapping("/api/students")
public class StudentController {
	
	private StudentService studentService;
	private CourseService courseService;
	
	@Autowired	
	public StudentController(StudentService studentService, CourseService courseService) {
		this.studentService = studentService;
		this.courseService = courseService;
	}


	@GetMapping()	
	public List<Student> getStudents() {
		List<Student> allStudents = studentService.getStudents();
		return  allStudents;
	}

	@PostMapping()
	public Student create(@RequestBody Student theStudent) {
		theStudent.setId(0);
		 studentService.save(theStudent);	
		 return theStudent;
	}	
	
	@PutMapping()	
	public  Student update(@RequestBody Student theStudent) {
	  studentService.save(theStudent);
		return  theStudent;
	}
	
	@GetMapping("/{id}")	
	public  Student getStudent(@PathVariable  long id) {
		return  studentService.getStudent(id);
	}
	
	@DeleteMapping("/{id}")	
	public  void delete(@PathVariable  long id) {
		 studentService.delete(id);
	}
	
	@PostMapping("/enroll-for-course")
	public Student enrollCourses(@RequestParam  long sId, @RequestParam  long[] cIds ) {
		return  studentService.enrollCourses(sId, cIds);
		
	}

}
















