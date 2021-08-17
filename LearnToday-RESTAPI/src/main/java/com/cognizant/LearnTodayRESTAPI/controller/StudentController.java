package com.cognizant.LearnTodayRESTAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.LearnTodayRESTAPI.model.Student;
import com.cognizant.LearnTodayRESTAPI.service.StudentService;

@RestController
@RequestMapping("/api")
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	/**
	 * return all the courses: http//localhost:8080/Student
	 * @return
	 */
	@GetMapping("/Student")
	public ResponseEntity<Object> getAllCourses(){
		
		return new ResponseEntity<>(studentService.getAllCourses(), HttpStatus.OK);
	}

	/**
	 * Enrolling student to the course
	 * @param s
	 * @return
	 */
	@PostMapping("/Student")
	public ResponseEntity<Object> postStudent(@RequestBody Student s){
		if(studentService.postStudent(s))
			return new ResponseEntity<Object>( HttpStatus.CREATED);
		return new ResponseEntity<Object>( HttpStatus.BAD_REQUEST);
		
	}
	
	/**
	 * Delete the student :http//localhost:8080/Student/1
	 * @param id
	 * @return
	 */
	@DeleteMapping("/Student/{id}")
	public ResponseEntity<Object> deleteStudentEnrollment(@PathVariable int id) {
			if(studentService.deleteStudent(id))
				return new ResponseEntity<Object>( HttpStatus.OK);
		return new ResponseEntity<Object>("No enrollment information found", HttpStatus.NOT_FOUND);
	}
}
