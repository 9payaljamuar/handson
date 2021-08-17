package com.cognizant.LearnTodayRESTAPI.service;

import java.util.List;

import com.cognizant.LearnTodayRESTAPI.model.Course;

public interface CourseService {

	public List<Course> getAllCourses();

	public Course getCourseById(int id);

}
