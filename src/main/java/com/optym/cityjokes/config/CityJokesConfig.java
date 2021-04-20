package com.optym.cityjokes.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.client.RestTemplate;

import com.optym.cityjokes.entity.CityJoke;
import com.optym.cityjokes.repository.CityJokesRepository;

@Configuration
@EnableScheduling
public class CityJokesConfig {
	@Autowired
	private CityJokesRepository repository;
	
	private RestTemplate restTemplate = new RestTemplate() ; 
	
	@Scheduled(fixedRate = 8000)
	public void scheduleFixedRateTask() {
		
		CityJoke cityJoke =  restTemplate.getForObject("https://official-joke-api.appspot.com/jokes/random", CityJoke.class);
		repository.save(cityJoke);
	    
	}

}
