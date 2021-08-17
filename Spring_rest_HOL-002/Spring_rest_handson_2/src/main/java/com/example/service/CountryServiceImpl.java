package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryServiceImpl implements CountryService {

	@Autowired
	public CountryService countryService;
	
	@Override
	public String getCountry(String code) {
		return countryService.getCountry(code);
	}

}
