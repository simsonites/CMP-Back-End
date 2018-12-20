package com.softpager.icmp.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softpager.icmp.daos.StudentDao;
import com.softpager.icmp.entities.Student;

@Service("studentService")
public class StudentServiceImpl implements StudentService {

	private StudentDao studentDao;
	
	@Autowired
	public StudentServiceImpl(StudentDao studentDao) {	
		this.studentDao = studentDao;
	}

	@Override
	@Transactional
	public Student save(Student theStudent) {		
		return studentDao.save(theStudent);
	}

	@Override
	@Transactional
	public List<Student> getStudents() {		
		return studentDao.getStudents();
	}

	@Override
@Transactional
	public Student getStudent(long id) {	
		return studentDao.getStudent(id);
	}

	@Override
	@Transactional
	public void delete(long id) {
	 studentDao.delete(id);
		
	}

	@Override
	@Transactional
	public Student enrollCourses(long sId, long[] cIds) {		
		return studentDao.enrollCourses(sId, cIds);
	}

}













