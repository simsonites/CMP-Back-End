package com.softpager.icmp.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softpager.icmp.daos.InstructorDao;
import com.softpager.icmp.entities.Instructor;

@Service("instructorService")
public class InstructorServiceImpl implements InstructorService {

	private InstructorDao instructorDao;	
	@Autowired
	public InstructorServiceImpl(InstructorDao instructorDao) {	
		this.instructorDao = instructorDao;
	}

	@Override
	@Transactional
	public List<Instructor> getInstructors() {		
		return instructorDao.getInstructors();
	}

	@Override
	@Transactional
	public Instructor save(Instructor theInstructor) {	
		return instructorDao.save(theInstructor);
	}

	@Override
	@Transactional
	public Instructor getInstructor(long id) {	
		return instructorDao.getInstructor(id);
	}

	@Override
	@Transactional
	public void delete(long id) {
		instructorDao.delete(id);
		
	}

}
