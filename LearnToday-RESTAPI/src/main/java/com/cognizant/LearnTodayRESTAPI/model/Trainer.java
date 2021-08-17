package com.cognizant.LearnTodayRESTAPI.model;

public class Trainer {

	private int trainerId;
	private String password;
	
	public Trainer() {
		// TODO Auto-generated constructor stub
	}

	public int getTrainerId() {
		return trainerId;
	}

	public void setTrainerId(int trainerId) {
		this.trainerId = trainerId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Trainer [trainerId=" + trainerId + ", password=" + password + "]";
	}
	
	
	
}
