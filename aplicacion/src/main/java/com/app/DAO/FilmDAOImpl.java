package com.app.DAO;

import javax.persistence.EntityManager;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.app.entities.Film;

@Repository
public class FilmDAOImpl implements FilmInterface{

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public String findByTitle(String title) {
		Session session = entityManager.unwrap(Session.class);
		Film film = session.get(Film.class, title);
		String t = film.getTitle();
		return t;
	}
	
}
