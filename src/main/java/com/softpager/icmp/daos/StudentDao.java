package com.softpager.icmp.daos;

import java.util.List;

import com.softpager.icmp.entities.Student;

public interface StudentDao {

	Student save(Student theStudent);

	List<Student> getStudents();

	Student getStudent(long id);

	void delete(long id);

	Student enrollCourses(long sId, long[] cIds);


}
