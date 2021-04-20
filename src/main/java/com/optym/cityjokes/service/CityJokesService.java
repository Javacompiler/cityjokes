package com.optym.cityjokes.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.optym.cityjokes.entity.CityJoke;
import com.optym.cityjokes.repository.SearchRepository;

@Service
public class CityJokesService {
	
	
	private SearchRepository searchRepository;
	
	public CityJokesService(SearchRepository searchRepository) {
		
		this.searchRepository = searchRepository;
		
	}

	public List<CityJoke> searchBykey(String search) {
		
		return searchRepository.searchBykey(search);
	}

	public List<CityJoke> searchByType(String type) {
		
		return searchRepository.searchByType(type);
	}

	public List<CityJoke> searchBykeyAndType(String search, String type) {
		
		return searchRepository.searchBykeyAndType(search, type);
	}
	
	

}
