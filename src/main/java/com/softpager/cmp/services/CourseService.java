package com.softpager.cmp.services;

import java.util.List;
import java.util.Optional;

import com.softpager.cmp.entities.Course;



public interface CourseService {

	List<Course> getCourses();

	Optional<Course> getCourse(long theId);

	Course addCourse(Course theCourse);

	void deleteCourse(long theId);

	Course updateCourse(long theId, Course theCourse);


}
