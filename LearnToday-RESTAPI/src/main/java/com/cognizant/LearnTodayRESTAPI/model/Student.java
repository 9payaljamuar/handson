package com.cognizant.LearnTodayRESTAPI.model;

public class Student {

	private int enrollmentId;
	private int studentId;
	private int courseId;
	private Course course;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public int getEnrollmentId() {
		return enrollmentId;
	}

	public void setEnrollmentId(int enrollmentId) {
		this.enrollmentId = enrollmentId;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public Course getCourse() {
		return course;
	}
	
	public void setCourse(Course course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [enrollmentId=" + enrollmentId + ", studentId=" + studentId + ", courseId=" + courseId + "]";
	}

	
	

}
