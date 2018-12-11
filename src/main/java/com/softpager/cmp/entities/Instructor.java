package com.softpager.cmp.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.softpager.cmp.utils.AuditModel;

import lombok.Data;
import lombok.EqualsAndHashCode;



@Data
@Entity
@Table(name="instructors")
@SuppressWarnings("serial")
@EqualsAndHashCode(callSuper=false)
public class Instructor extends AuditModel {
	@Id
	@Column(name = "instructor_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "mobile")
	private String mobileContact;

	@Column(name = "email")
	private String email;

	@Column(name = "title")
	private String title;
	
	@OneToMany(mappedBy = "instructor", cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST,
			CascadeType.REFRESH })		
	private List<Course> courses;


	public Instructor() {	}	
	public Instructor(String firstName, String lastName, String mobileContact, String email, String title) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileContact = mobileContact;
		this.email = email;
		this.title = title;
	}

	// // add convenience methods for bi-directional relationship

	public void addCourseForInstructor(Course tempCourse) {
		if (courses == null) {
			courses = new ArrayList<>();
		}
		courses.add(tempCourse);
		tempCourse.setInstructor(this);
	}

	

}
