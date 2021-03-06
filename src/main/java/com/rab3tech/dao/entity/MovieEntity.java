package com.rab3tech.dao.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="movie_tbl")
public class MovieEntity {
	
	private int mid;
	private String name;
	private Date year;
	private String director;
	private String poster;
	private String story;
	
	//since one movie can have multiple actors
	// below code is to make bidirectional mapping with actors and movies
	// upto ActorsEntity getter and setter
	private List<ActorsEntity> actors;
	
	//mappedby is used for bidirectional mapping if it was unidirectional
	// we do not need mappedBy i.e not responsbile for relationalship
	
	// unique key and primary key is same except the unique key can have 
	// null value whereas primary key cannot have null value.
	@OneToMany(mappedBy = "movie",cascade = { CascadeType.ALL})
	public List<ActorsEntity> getActors() {
		return actors;
	}

	public void setActors(List<ActorsEntity> actors) {
		this.actors = actors;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	@Column(name="name",length = 100)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getYear() {
		return year;
	}

	public void setYear(Date year) {
		this.year = year;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getPoster() {
		return poster;
	}

	public void setPoster(String poster) {
		this.poster = poster;
	}

	public String getStory() {
		return story;
	}

	public void setStory(String story) {
		this.story = story;
	}

	@Override
	public String toString() {
		return "MovieEntity [mid=" + mid + ", name=" + name + ", year=" + year + ", director=" + director + ", poster="
				+ poster + ", story=" + story + "]";
	}

}

