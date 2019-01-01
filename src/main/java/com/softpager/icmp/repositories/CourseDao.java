package com.softpager.icmp.repositories;

import java.util.List;

import com.softpager.icmp.entities.Course;

public interface CourseDao {

	List<Course> getCourses();

	Course save(Course theCourse);

	Course getCourse(long id);

	void delete(long id);

}
