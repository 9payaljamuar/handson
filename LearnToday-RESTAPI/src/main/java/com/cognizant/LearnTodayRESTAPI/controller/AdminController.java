package com.cognizant.LearnTodayRESTAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.LearnTodayRESTAPI.model.Course;
import com.cognizant.LearnTodayRESTAPI.service.CourseService;

@RestController
@RequestMapping("/api/")
public class AdminController {
	@Autowired
	CourseService courseService;
	
	/**
	 * Return all the courses: http://localhost:8080/Admin
	 * @return
	 */
	@GetMapping("/Admin")
	public ResponseEntity<Object> getAllCourses(){
		return new ResponseEntity<>(courseService.getAllCourses(), HttpStatus.OK);
	}
	
	/**
	 * Return course by Id: http://localhost:8080/Admin/2
	 * @param courseId
	 * @return
	 */
	@GetMapping("/Admin/{courseId}")
	public ResponseEntity<Object> getCourseById(@PathVariable("courseId") int courseId){
		Course course = courseService.getCourseById(courseId);
		if(course!=null)
			return new ResponseEntity<>(course, HttpStatus.OK);
		return new ResponseEntity<>("Searched Data Not Found", HttpStatus.NOT_FOUND);
	}
	
}
