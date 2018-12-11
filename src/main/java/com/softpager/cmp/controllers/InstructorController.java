package com.softpager.cmp.controllers;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.softpager.cmp.entities.Instructor;
import com.softpager.cmp.services.InstructorService;

@RestController
@RequestMapping("/api")
public class InstructorController {
		
	private InstructorService instructorService;
	
	@Autowired
	public InstructorController(InstructorService instructorService) {	
		this.instructorService = instructorService;
	}
  
	@GetMapping("/instructors")
	public List<Instructor> getInstructors(){		
		return instructorService.getInstructors();			
	}
	
	@GetMapping("/instructors/{id}")
	public  Optional<Instructor> getInstructor(@PathVariable("id") long theId){		
		return instructorService.getInstructor(theId);		
	}
	
	@PostMapping("/instructors")
	public Instructor addInstructor(@Valid @RequestBody  Instructor theInstructor) {
		return instructorService.addInstgructor(theInstructor);
	}
	
	@PutMapping("/instructors/{instructorId}") 
	 public Instructor updateInstructor(@PathVariable("instructorId") long id, @RequestBody Instructor theInstructor) {
		return instructorService.updateInstructor(id, theInstructor);
	}
	
	@DeleteMapping("/instructors/{instructorId}")
	public void deleteInstructor(@PathVariable("instructorId") long id) {
		instructorService.deleteInstructor(id);		
	}

/*	@PostMapping("/instructors/course")
	public  List<Course> addCourseForInstructor(@RequestParam  int insId, @RequestParam  int cId){		
		return instructorService.addCourseForInstructor(insId, cId);		
	}*/
	
}




























