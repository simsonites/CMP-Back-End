package com.softpager.icmp.services;

import java.util.List;

import com.softpager.icmp.entities.Course;

public interface CourseService {

	List<Course> getCourses();

	Course save(Course theCourse);

	Course getCourse(long id);

	void delete(long id);

}
