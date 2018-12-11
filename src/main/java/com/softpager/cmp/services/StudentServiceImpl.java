package com.softpager.cmp.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.softpager.cmp.entities.Student;
import com.softpager.cmp.repositories.StudentRepository;



@Service
public class StudentServiceImpl implements StudentService {
	
	private StudentRepository studentRepository;	
	
	@Autowired
	public StudentServiceImpl(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}
	

	@Override
	public Page<Student> getStudents(PageRequest page) {			
		return  studentRepository.findAll(page);
		
	}

	@Override
	public Optional<Student> getStudent(long sId) {	
		Optional<Student> theStudent =  studentRepository.findById(sId);
		return theStudent;
	}

	@Override	
	public Student addStudent(Student theStudent) {
	 return studentRepository.save(theStudent);		
	}

	@Override
	public Student updateStudent(Student theStudent) {
		return studentRepository.save(theStudent);
		
	}

	@Override	
	public void deleteStudent(long theId) {
		studentRepository.deleteById(theId);		
	}


	@Override
	public void deleteSelected(List<Student> studentIds) {
	studentRepository.deleteInBatch(studentIds);	
	}

}





















