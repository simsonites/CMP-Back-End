package com.softpager.cmp.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import com.softpager.cmp.entities.Instructor;



public interface InstructorService {

	List<Instructor> getInstructors();

	Optional<Instructor> getInstructor(long theId);

	Instructor addInstgructor(@Valid Instructor theInstructor);

	Instructor updateInstructor(long id, Instructor theInstructor);

	void deleteInstructor(long id);





}
