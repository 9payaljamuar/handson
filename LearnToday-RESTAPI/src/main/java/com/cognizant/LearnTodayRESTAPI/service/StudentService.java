package com.cognizant.LearnTodayRESTAPI.service;

import java.util.List;

import com.cognizant.LearnTodayRESTAPI.model.Course;
import com.cognizant.LearnTodayRESTAPI.model.Student;

public interface StudentService {

	public List<Course> getAllCourses();
	
	public boolean postStudent(Student s);
	
	public boolean deleteStudent(int enrollmentId);
	
}
