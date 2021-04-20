package com.optym.cityjokes.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.optym.cityjokes.entity.CityJoke;
import com.optym.cityjokes.repository.CityJokesRepository;

@Controller
public class AdvanceSearchController {
	@Autowired
	private CityJokesRepository repo;
	@RequestMapping("/category")
	public @ResponseBody List<String> get(Model m) {
		List<CityJoke> list=repo.findAll();
		List<String> types = list.stream().map(CityJoke::getType).collect(Collectors.toList());
		
		return types;
	}

}
