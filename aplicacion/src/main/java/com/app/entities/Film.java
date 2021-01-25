package com.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="Films")
public class Film {
	
	@Column(name="adult")
	private boolean adult;
	
	@Column(name="backdrop_path")
	private String backdrop_path;
	
	@Column(name="genre_ids")
	private int[] genre_ids;
	
	@Id
	@Column(name="id", nullable=false)
	private long id;
	
	@Column(name="original_language")
	private String original_language;
	
	@Column(name="original_title", nullable=false)
	private String original_title;
	
	@Column(name="overview")
	private String overview;
	
	@Column(name="popularity")
	private int popularity;
	
	@Column(name="poster_path")
	private String poster_path;
	
	@Column(name="release_date")
	private String release_date;
	
	@Column(name="title", nullable=false)
	private String title;
	
	@Column(name="video")
	private boolean video;
	
	@Column(name="vote_average")
	private double vote_average;
	
	@Column(name="vote_count")
	private int vote_count;
	
	
	
	protected Film() {}

	public Film(String original_title, String title) {
		this.original_title = original_title;
		this.title = title;
	}
	
	@Override
	public String toString() {
		return String.format("Original film title: %s, title: %s", 
				original_title, title);
	}
	
	
	public boolean getAdult() {
		return adult;
	}
	
	public String getBackdrop_path() {
		return backdrop_path;
	}
	
	public int[] getGenre_ids() {
		return genre_ids;
	}
	
	public long getId() {
		return id;
	}
	
	public String getOriginal_title() {
		return original_title;
	}
	
	public String getOriginal_language() {
		return original_language;
	}
	
	public String getOverview() {
		return overview;
	}
	
	public int getPopularity() {
		return popularity;
	}
	
	public String getPoster_path() {
		return poster_path;
	}
	
	public String getRelease_date() {
		return release_date;
	}
	
	public String getTitle() {
		return title;
	}
	
	public boolean getVideo() {
		return video;
	}
	
	public double getVote_average() {
		return vote_average;
	}
	
	public int vote_count() {
		return vote_count;
	}
}
