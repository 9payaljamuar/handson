package com.cognizant.LearnTodayRESTAPI.dao;

import java.util.List;

import com.cognizant.LearnTodayRESTAPI.model.Course;
import com.cognizant.LearnTodayRESTAPI.model.Student;

public interface StudentDao {

	public List<Course> getAllCourses();
	
	public boolean postStudent(Student s);
	
	public boolean deleteStudent(int enrollmentId);
	
}
