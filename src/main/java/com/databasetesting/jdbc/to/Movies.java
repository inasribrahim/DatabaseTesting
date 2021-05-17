package com.databasetesting.jdbc.to;

public class Movies {
	
	    private String name;
	    private int year;
	    private double imdb_rating;
	    private String genre;
	   
	    public String getName() {
	        return name;
	    }
	    public void setName(String mvName) {
	        this.name = mvName;
	    }
	    public int getYear() {
	        return year;
	    }
	    public void setYear(int Datayear) {
	        this.year = Datayear;
	    }
	    public double getimdb_rating() {
	        return imdb_rating;
	    }
	    public void setimdb_rating(double imdb_rating) {
	        this.imdb_rating = imdb_rating;
	    }
	    public void setGenre(String genre) {
	        this.genre = genre;
	    }
	    public String getGenre() {
	        return genre;
	    }   
}
