package com.softpager.icmp.services;

import java.util.List;

import com.softpager.icmp.entities.Instructor;

public interface InstructorService {

	List<Instructor> getInstructors();

	Instructor save(Instructor theInstructor);

	Instructor getInstructor(long id);

	void delete(long id);




}
