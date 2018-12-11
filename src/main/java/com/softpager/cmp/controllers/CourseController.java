package com.softpager.cmp.controllers;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.softpager.cmp.entities.Course;
import com.softpager.cmp.services.CourseService;

@RestController
@RequestMapping("/api")
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	@GetMapping("/courses")
	public List<Course> getCourses(){
		return courseService.getCourses();
	}
	
	@GetMapping("/courses/{courseId}")
	public Optional<Course> getCourse(@PathVariable("courseId") long theId) {
		return courseService.getCourse(theId);
	}
	
	@PostMapping("/courses")
	public Course addCourse(@Valid @RequestBody Course theCourse) {	
		return courseService.addCourse(theCourse);
	}
	
	@PutMapping("/courses/{courseId}")
	public Course updateCourse(@PathVariable("courseId") long  theId, @RequestBody Course theCourse) {		
		return courseService.updateCourse(theId , theCourse);
	}
	
	@DeleteMapping("/courses/{courseId}")
	public void deleteCourse(@PathVariable("courseId") long theId) {
		 courseService.deleteCourse(theId);
	}

}





























