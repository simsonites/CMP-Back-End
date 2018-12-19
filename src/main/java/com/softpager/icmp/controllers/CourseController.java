package com.softpager.icmp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.softpager.icmp.entities.Course;
import com.softpager.icmp.services.CourseService;

@RestController
@RequestMapping("/api/courses")
public class CourseController {
	
	private CourseService courseService;	
	@Autowired
	public CourseController(CourseService courseService) {		
		this.courseService = courseService;
	}

	@GetMapping()
	public List<Course> getCourses(){
		List<Course> allCourses = courseService.getCourses();
		return allCourses;
		}
	
	@PostMapping()
	public Course create(@RequestBody Course theCourse) {
		theCourse.setId(0);
		 courseService.save(theCourse);
		 return theCourse;
	}
	
	@PutMapping()
	public Course update(@RequestBody Course theCourse) {	
		 courseService.save(theCourse);
		 return theCourse;
	}
	
	
	@GetMapping("/{id}")
	public Course  getCourse(@PathVariable long id){
		Course theCourse = courseService.getCourse(id);
		return theCourse;
		}
	@DeleteMapping("/{id}")
	public void  delete(@PathVariable long id){
		Course theCourse = courseService.getCourse(id);	
		// do some valid check here
		courseService.delete(id);
	
		}
	

}
