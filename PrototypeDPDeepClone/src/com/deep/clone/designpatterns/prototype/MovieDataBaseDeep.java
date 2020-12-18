package com.deep.clone.designpatterns.prototype;

import java.util.ArrayList;
import java.util.List;

public class MovieDataBaseDeep implements Cloneable {

    private String movieName;
    private String releaseDate;
    private List<String> genre;
    private List<String> ratings;

    public MovieDataBaseDeep() {
        System.out.println("Defaut Constructor");
    }

    public MovieDataBaseDeep(String movieName, String releaseDate, List<String> genre, List<String> ratings) {
        this.movieName = movieName;
        this.releaseDate = releaseDate;
        this.genre = genre;
        this.ratings = ratings;
    }

    @Override
    public String toString() {
        return String.format("MovieDataBaseDeep [movieName=%s, releaseDate=%s,\n genre=%s, ratings=%s]", movieName,
                releaseDate, genre, ratings);
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public List<String> getGenre() {
    	if(genre==null)
    	{
    		genre = new ArrayList<String>();
    	}
        return genre;
    }

    public void setGenre(List<String> genre) {
        this.genre = genre;
    }

    public List<String> getRatings() {
    	if(ratings==null)
    	{
    		ratings = new ArrayList<String>();
    	}
        return ratings;
    }

    public void setRatings(List<String> ratings) {
        this.ratings = ratings;
    }
    
    @Override
    protected MovieDataBaseDeep clone() throws CloneNotSupportedException {
        List<String> deepRatings = new ArrayList<String>();
      //deep cloning of ratings as it is mutable
        deepRatings.addAll(this.ratings);
        //shallow cloning of genre
        return new MovieDataBaseDeep(this.movieName, this.releaseDate, this.genre, deepRatings);
    }

}