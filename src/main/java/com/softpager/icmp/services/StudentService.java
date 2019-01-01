package com.softpager.icmp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import com.softpager.icmp.entities.Student;

public interface StudentService {

	Page<Student> getStudents(PageRequest page);

	Optional<Student> getStudent(long sId);

	Student addStudent(Student theStudent);

	Student updateStudent(Student theStudent);
	
	void deleteStudent(long theId);

}
