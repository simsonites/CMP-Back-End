package com.softpager.icmp.daos;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.softpager.icmp.entities.Course;

@Repository("courseRepository")
public class CourseDaoImpl implements CourseDao {

	private EntityManager entityManager;	
	 @Autowired
	public CourseDaoImpl(EntityManager entityManager) {		
		this.entityManager = entityManager;
	}

	@Override
	public List<Course> getCourses() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Course> courseQuery = currentSession.createQuery("from Course", Course.class);
		List<Course> allCourses = courseQuery.getResultList();		
		return allCourses;
	}

	@Override
	public Course save(Course theCourse) {
	 Session currentSession = entityManager.unwrap(Session.class);
	 currentSession.saveOrUpdate(theCourse);
		return theCourse;
	}

	@Override
	public Course getCourse(long id) {
		 Session currentSession = entityManager.unwrap(Session.class);
		 Course theCourse = currentSession.get(Course.class, id);		
		return theCourse;
	}

	@Override
	public void delete(long id) {
		 Session currentSession = entityManager.unwrap(Session.class);
		 Query courseQuery = currentSession.createQuery("delete from Course where id=:id");
		 courseQuery.setParameter("id", id);
		 courseQuery.executeUpdate();	
	}

}
