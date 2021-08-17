package com.cognizant.LearnTodayRESTAPI.dao;

import com.cognizant.LearnTodayRESTAPI.model.Trainer;

public interface TrainerDao {

	public boolean trainerSignUp(Trainer t);
	
	public String updatePassword(int id, Trainer t);  
	
}
