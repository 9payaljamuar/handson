package com.cognizant.LearnTodayRESTAPI.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.cognizant.LearnTodayRESTAPI.model.Course;

@Repository
public class CourseDaoImpl implements CourseDao {

	@Autowired
	JdbcTemplate template;

	/**
	 * get all the courses function
	 */
	@Override
	public List<Course> getAllCourses() {

		return template.query("select * from Course", new ResultSetExtractor<List<Course>>() {
			@Override
			public List<Course> extractData(ResultSet rs) throws SQLException, DataAccessException {

				List<Course> list = new ArrayList<Course>();
				while (rs.next()) {
					Course e = new Course();
					e.setCourseId(rs.getInt(1));
					e.setTitle(rs.getString(2));
					e.setFees(rs.getFloat(3));
					e.setDescription(rs.getString(4));
					e.setTrainer(rs.getString(5));
					e.setStartDate(rs.getDate(6));
					list.add(e);
				}
				return list;
			}
		});
	}

	/**
	 * Get course by id function
	 */
	@Override
	public Course getCourseById(int id) {
		List<Course> list = getAllCourses();
		for (Course course : list) {
			if(course.getCourseId()== id) {
				return course;
			}
		}
		return null;
	}

}
