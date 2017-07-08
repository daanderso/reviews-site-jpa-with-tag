package com.Derek.reviewssitejpa;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Tag {

	//Instance variables
	
	@Id
	@GeneratedValue
	private long id;
	
	private String name;
	
//	//adding for mapping
	@ManyToMany(mappedBy="tags")
	private Set<Review> reviews;
	
	

	//constructors
	public Tag(String name) {
		this.name= name;
	}

	//argument constructor required for JPA
	private Tag() {}
		

	//getters
	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Set<Review> getReviews() {
		return reviews;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
}
