package edu.kh.poly.pack99.model.dto;

public class Game {
	
	public String name;
	public String genre;
	
	public Game() {
		super();
	}
	
	public Game(String name, String genre) {
		this.name = name;
		this.genre = genre;
	}
	
	public String getName() {
		return name;
	}
	
	public String getGenre() {
		return genre;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public String toString() {
		return "name : " + name + "/" + "genre : " + genre;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
