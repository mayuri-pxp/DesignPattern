package com.deep.clone.designpatterns.prototype;

import java.util.List;

public class Registery {	
	
	
	public Registery()
	{
		getData();
	}
    
    public MovieDataBaseDeep getData() {    	
    	MovieDataBaseDeep movDataBase = new MovieDataBaseDeep();
        System.out.println("Getting Data from External REST API");
        movDataBase.setMovieName("The Dark Knight");
        movDataBase.setReleaseDate("2018");
        List<String> genre = movDataBase.getGenre();
        genre.add("Drama");
        genre.add("Thriller");
        List<String> ratings = movDataBase.getRatings();
        ratings.add("IMDB:9");
        ratings.add("RottenTomatoes:94%");
        ratings.add("MetaCritic:84%");
        System.out.println("You have been charged 1$ for last API call.");
		return movDataBase;
    }
}
