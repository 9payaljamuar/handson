package com.cognizant.LearnTodayRESTAPI.service;

import com.cognizant.LearnTodayRESTAPI.model.Trainer;

public interface TrainerService {

public boolean trainerSignUp(Trainer t);
	
	public String updatePassword(int id, Trainer t);

}
