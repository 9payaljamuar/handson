package com.cognizant.LearnTodayRESTAPI;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearnTodayRestapiApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(LearnTodayRestapiApplication.class);
	
	public static void main(String[] args) {
		LOGGER.info("START");
		SpringApplication.run(LearnTodayRestapiApplication.class, args);
		LOGGER.info("END");
	}

}
