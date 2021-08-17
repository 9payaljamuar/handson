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
import com.cognizant.LearnTodayRESTAPI.model.Student;

@Repository
public class StudentDaoImpl implements StudentDao {

	@Autowired
	JdbcTemplate template;

	/** get all course function
	 * 
	 */
	@Override
	public List<Course> getAllCourses() {
		return template.query("select * from Course order by start_date", new ResultSetExtractor<List<Course>>() {
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
	 * updating function
	 */
	@Override
	public boolean postStudent(Student s) {
		int update = 0;
		update = template.update("INSERT INTO Student VALUES (?,?,?)", s.getEnrollmentId(), s.getStudentId(),
				s.getCourseId());
		if (update == 0)
			return false;
		return true;
	}


	/**
	 *  delete student function
	 */
	@Override
	public boolean deleteStudent(int enrollmentId) {
		int update = 0;
		update = template.update("DELETE FROM Student WHERE enrollmentId= ?", enrollmentId);
		if (update == 0)
			return false;
		return true;
	}

}
