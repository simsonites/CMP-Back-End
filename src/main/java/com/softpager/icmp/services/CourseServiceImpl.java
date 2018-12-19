package com.softpager.icmp.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softpager.icmp.daos.CourseDao;
import com.softpager.icmp.entities.Course;

@Service("courseService")
public class CourseServiceImpl implements CourseService {

	private CourseDao courseDoa;
	
	@Autowired
	public CourseServiceImpl(CourseDao courseDoa) {	
		this.courseDoa = courseDoa;
	}

	@Override
	@Transactional
	public List<Course> getCourses() {	
		return courseDoa.getCourses();
	}

	@Override
	@Transactional
	public Course save(Course theCourse) {		
		return courseDoa.save(theCourse);
	}

	@Override
	@Transactional
	public Course getCourse(long id) {		
		return courseDoa.getCourse(id);
	}

	@Override
	@Transactional
	public void delete(long id) {
		courseDoa.delete(id);
		
	}


}















