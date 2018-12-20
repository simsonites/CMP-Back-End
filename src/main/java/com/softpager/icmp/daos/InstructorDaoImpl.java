package com.softpager.icmp.daos;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.softpager.icmp.entities.Instructor;

@Repository("instructorRepository")
public class InstructorDaoImpl implements InstructorDao {

	private EntityManager  entityManager;	
	@Autowired
	public InstructorDaoImpl(EntityManager entityManager) {	
		this.entityManager = entityManager;
	}
	
	@Override
	public List<Instructor> getInstructors() {		
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Instructor> instructorQuery = currentSession.createQuery("from Instructor", Instructor.class);
		List<Instructor> allInstructors = instructorQuery.getResultList();
		return allInstructors;
	}

	@Override
	public Instructor save(Instructor theInstructor) {	
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(theInstructor);
		return theInstructor;
	}

	@Override
	public Instructor getInstructor(long id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Instructor theInstructor = currentSession.get(Instructor.class, id);
		return theInstructor;
	}

	@Override
	public void delete(long id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Query instructorQuery = currentSession.createQuery("delete from Instructor where id= :id");
		instructorQuery.setParameter("id", id);
		instructorQuery.executeUpdate();
		
	}

}
























