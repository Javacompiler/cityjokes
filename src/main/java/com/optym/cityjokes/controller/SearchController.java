package com.optym.cityjokes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.optym.cityjokes.entity.CityJoke;
import com.optym.cityjokes.service.CityJokesService;

@Controller

public class SearchController {

	@Autowired
	private CityJokesService cityJokesService;

	@RequestMapping(value = "/search", method = RequestMethod.POST)
	public String searchJokes(@RequestParam("search") String search, @RequestParam("type") String type, Model model) {
		List<CityJoke> cityJokes = null;
		if ((!search.isBlank() || !search.isEmpty()) && (type.isBlank() || type.isEmpty())) {
			cityJokes = cityJokesService.searchBykey(search);
			model.addAttribute("cityJokes", cityJokes);
		}
		if ((!type.isBlank() || !type.isEmpty()) && (search.isBlank() || search.isEmpty())) {
			cityJokes = cityJokesService.searchByType(type);
			model.addAttribute("cityJokes", cityJokes);
		}
		if ((!search.isBlank() || !search.isEmpty()) && (!type.isBlank() || !type.isEmpty())) {
			cityJokes = cityJokesService.searchBykeyAndType(search,type);
			model.addAttribute("cityJokes", cityJokes);
		}

		return "index";
	}

}
