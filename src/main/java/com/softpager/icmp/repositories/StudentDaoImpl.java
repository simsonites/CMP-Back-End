package com.softpager.icmp.daos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.softpager.icmp.entities.Course;
import com.softpager.icmp.entities.Student;
import com.softpager.icmp.exceptions.ICMPResourceNotFoundException;

@Repository("studentRepository")
public class StudentDaoImpl implements StudentDao {

	private EntityManager entityManager;	
	@Autowired
	public StudentDaoImpl(EntityManager entityManager) {	
		this.entityManager = entityManager;
	}

	@Override
	public Student save(Student theStudent) {	
		Session currentSession =  entityManager.unwrap(Session.class);
		     currentSession.saveOrUpdate(theStudent);
		     return null;
		     }

	@Override
	public List<Student> getStudents() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Student> studentQuery = currentSession.createQuery("from Student", Student.class);
		List<Student>studentList = studentQuery.getResultList();
		return studentList;
	}

	@Override
	public Student getStudent(long id) {
	Session currentSession = entityManager.unwrap(Session.class);
	Student theStudent = currentSession.get(Student.class, id);
	if(theStudent == null) {
		throw new ICMPResourceNotFoundException("No student found with  id  : " + id );		
	}
		return theStudent;
	}

	@Override
	public void delete(long id) {
		Session currentSession = entityManager.unwrap(Session.class);		
		Query theQuery = 	currentSession.createQuery("delete from Student where id=:id");
		theQuery.setParameter("id", id);		
		theQuery.executeUpdate();
		
	}

	@Override
	public Student enrollCourses(long sId, long[] cIds) {
	
		return null;
	}

}
