package com.softpager.icmp.services;

import java.util.List;

import com.softpager.icmp.entities.Student;

public interface StudentService {

	Student save(Student theStudent);

	List<Student> getStudents();

	Student getStudent(long id);

	void delete(long id);


}
