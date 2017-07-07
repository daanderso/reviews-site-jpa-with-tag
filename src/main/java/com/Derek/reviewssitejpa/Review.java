package com.Derek.reviewssitejpa;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Review {

	// Instance variables
	@Id
	@GeneratedValue
	private long id;
	
	private String movieTitle;
	private String imageUrl;
	@Lob
	private String content;
	private String date;
	@Lob
	private String synopsis;
	@ManyToOne
	private Genre genre; 

    @ManyToMany
	private Set<Tag> tags;  //creating relationship with reviews testing




	// Review constructor
	//Constructor
	public Review(Genre genre, String movieTitle, String content, String date, 
			String synopsis, String imageUrl, Tag... tags){
	 this.genre = genre;
	 this.movieTitle = movieTitle;
	 this.content = content;
	 this.date = date;
	 this.synopsis = synopsis;
	 this.imageUrl = imageUrl;
	 this.tags = new HashSet<>(Arrays.asList(tags)); //testing
	}
	

	//No argument constructor required for JPA
	private Review() {}
	
	
	//Getters
	public long getId() {
		return id;
	}
	
	public Genre getGenre() {
		return genre;
	}
	
	public String getMovieTitle() {
		return movieTitle;
	}
	
	public String getContent() {
		return content;
	}
	
	public String getDate() {
		return date;
	}
	
	public String getImageUrl() {
		return imageUrl;
	}
	

	public String getSynopsis() {
		return synopsis;
	}

	
	public Set<Tag> getTags() {
		return tags;
	}
	
	@Override
	public String toString() {
		return "Review [tags=" + tags + "]";
	}

}
