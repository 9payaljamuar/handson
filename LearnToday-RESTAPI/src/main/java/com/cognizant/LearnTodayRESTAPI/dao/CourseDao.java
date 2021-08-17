package com.cognizant.LearnTodayRESTAPI.dao;

import java.util.List;

import com.cognizant.LearnTodayRESTAPI.model.Course;

public interface CourseDao {

	public List<Course> getAllCourses();
	
	public Course getCourseById(int id);
	
}
