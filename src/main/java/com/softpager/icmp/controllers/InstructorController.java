package com.softpager.icmp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.softpager.icmp.entities.Instructor;
import com.softpager.icmp.services.InstructorService;

@RestController
@RequestMapping("/api/instructors")
public class InstructorController {

	private InstructorService instructorService;	
	
    @Autowired
	public InstructorController(InstructorService instructorService) {	
		this.instructorService = instructorService;
	}

	@GetMapping()
	public List<Instructor> getInstructors(){
		List<Instructor> allInstructors = instructorService.getInstructors();
		return allInstructors;		
	}
	
	@PostMapping()
	public Instructor create(@RequestBody Instructor theInstructor) {
		theInstructor.setId(0);
		instructorService.save(theInstructor);
		return theInstructor;
	}
	
	@PutMapping()
	public Instructor update(@RequestBody Instructor theInstructor) {		
		instructorService.save(theInstructor);
		return theInstructor;
	}
	
	@GetMapping("/{id}")
	public Instructor getInstructor(@PathVariable long id){
		Instructor theInstructors = instructorService.getInstructor(id);
		return theInstructors;		
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id){
		Instructor theInstructors = instructorService.getInstructor(id);
		//do some valid check here
		 instructorService.delete(id);		
	}
	
}


















