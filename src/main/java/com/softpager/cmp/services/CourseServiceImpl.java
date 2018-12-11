package com.softpager.cmp.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.softpager.cmp.entities.Course;
import com.softpager.cmp.repositories.CourseRepository;



@Service
@Transactional
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseRepository courseRepository;
	
	@Override
	public List<Course> getCourses() {	
		List<Course> courseList = new ArrayList<>();
		  courseRepository.findAll().forEach(courseList :: add);
		  return courseList;		
	}

	@Override	
	public Optional<Course> getCourse(long theId) {	
		Optional<Course> theCourse = courseRepository.findById(theId);
		return theCourse;
	}

	@Override
	public Course addCourse(Course theCourse) {
		return courseRepository.save(theCourse);			
	}
	
	@Override
	public Course updateCourse(long theId, Course theCourse) {		
		return courseRepository.save(theCourse);
	}

	@Override
	public void deleteCourse(long theId) {	
		 courseRepository.deleteById(theId);
		
	}

}

















