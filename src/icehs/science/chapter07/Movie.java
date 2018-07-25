package icehs.science.chapter07;

public class Movie {
	String title;
	String director;
	String genre;
	
	Movie(){
	}
	
	Movie(String title, String director){
		this.title = title;
		this.director = director;
	}

	public Movie(String title, String director, String genre) {
		super();
		this.title = title;
		this.director = director;
		this.genre = genre;
	}

}
