package com.cognizant.LearnTodayRESTAPI.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.LearnTodayRESTAPI.dao.StudentDao;
import com.cognizant.LearnTodayRESTAPI.model.Course;
import com.cognizant.LearnTodayRESTAPI.model.Student;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentDao studentDao;
	
	@Override
	public List<Course> getAllCourses() {
		return studentDao.getAllCourses();
	}

	@Override
	public boolean postStudent(Student s) {
		return studentDao.postStudent(s);
	}

	@Override
	public boolean deleteStudent(int enrollmentId) {
		return studentDao.deleteStudent(enrollmentId);
	}

}
