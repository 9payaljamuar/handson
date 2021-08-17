package com.cognizant.LearnTodayRESTAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.LearnTodayRESTAPI.model.Trainer;
import com.cognizant.LearnTodayRESTAPI.service.TrainerService;

@RestController
@RequestMapping("/api/")
public class TrainerController {

	@Autowired
	TrainerService trainerService;

	@PostMapping("/Trainer")
	public ResponseEntity<Object> trainerSignUp(@RequestBody Trainer t) {
		boolean signUp = trainerService.trainerSignUp(t);
		if (signUp)
			return new ResponseEntity<>(t, HttpStatus.CREATED);
		return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	}

	@PutMapping("/Trainer/{id}")
	public ResponseEntity<Object> updatePassword(@PathVariable int id, @RequestBody Trainer t){
		String r = trainerService.updatePassword(id, t);
		if(r.equals("updated")) return new ResponseEntity<>("Data updated successfully",HttpStatus.OK);
		if(r.equals("notfound")) return new ResponseEntity<>("Searched Data Not Found", HttpStatus.NOT_FOUND);
		return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	}
	
}
