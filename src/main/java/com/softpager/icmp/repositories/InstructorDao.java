package com.softpager.icmp.repositories;

import java.util.List;

import com.softpager.icmp.entities.Instructor;

public interface InstructorDao {

	List<Instructor> getInstructors();

	Instructor save(Instructor theInstructor);

	Instructor getInstructor(long id);

	void delete(long id);

}
