package com.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class App {
	
	
	private RestTemplate restTemplate = new RestTemplate();

	public App() {
		this.restTemplate = restTemplate;
    }
	
	@GetMapping("/api/films/{title}")
	public String getFilms(@PathVariable String title) {
        String url = "https://api.themoviedb.org/3/search/movie?api_key="
        		+ "720242cac380ed8033e6d3f380fa3f22&language=en-US&query="
        		+ title;
        String res = this.restTemplate.getForObject(url, String.class);
        return res;
    }
	
}