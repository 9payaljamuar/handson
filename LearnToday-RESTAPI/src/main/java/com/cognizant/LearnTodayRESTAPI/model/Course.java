package com.cognizant.LearnTodayRESTAPI.model;

import java.sql.Date;
import java.util.List;

public class Course {

	private int courseId;
	private String title;
	private float fees;
	private String description;
	private String trainer;
	private Date startDate;
	private List<Student> students;
	
	public Course() {
		// TODO Auto-generated constructor stub
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public float getFees() {
		return fees;
	}

	public void setFees(float fees) {
		this.fees = fees;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTrainer() {
		return trainer;
	}

	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", title=" + title + ", fees=" + fees + ", description=" + description
				+ ", trainer=" + trainer + ", startDate=" + startDate + "]";
	}
	
	
}
