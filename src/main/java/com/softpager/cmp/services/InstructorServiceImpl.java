package com.softpager.cmp.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softpager.cmp.entities.Instructor;
import com.softpager.cmp.repositories.InstructorRepository;


@Service 
public class InstructorServiceImpl implements InstructorService {	
		private InstructorRepository instructorRepository;
		
	@Autowired
	public InstructorServiceImpl(InstructorRepository instructorRepository) {	
		this.instructorRepository = instructorRepository;
	}

	@Override
	public List<Instructor> getInstructors() {			
		List<Instructor> instructors = new ArrayList<>();
		instructorRepository.findAll().forEach(instructors :: add);
		return instructors;
	}	
	
	@Override	
	public Optional<Instructor> getInstructor(long theId) {		
		Optional<Instructor> theInstructor = instructorRepository.findById(theId);
		return theInstructor;
	}

	@Override
	public Instructor addInstgructor(@Valid Instructor theInstructor) {		
		return instructorRepository.save(theInstructor);
	}

	@Override
	public Instructor updateInstructor(long id, Instructor theInstructor) {	
		return instructorRepository.save(theInstructor);
	}

	@Override
	public void deleteInstructor(long id) {	
		 instructorRepository.deleteById(id);
	}
	
	
	


}





























