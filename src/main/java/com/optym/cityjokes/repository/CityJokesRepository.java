
package com.optym.cityjokes.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.optym.cityjokes.entity.CityJoke;

public interface CityJokesRepository extends MongoRepository<CityJoke, Long> {
	
	
	

}
