package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import com.app.DAO.FilmInterface;

public class FilmServiceImpl implements FilmServiceInterface {

	@Autowired
	private FilmInterface filmInterface;
	
	@Override
	public String findByTitle(String title) {
		String film = filmInterface.findByTitle(title);
		return film;
	}

}