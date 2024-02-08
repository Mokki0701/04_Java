package edu.kh.poly.pack99.model.dto;

public class MapleLand extends Game {

public String level;
	
	public MapleLand() {}
	
	public MapleLand(String name, String genre, String level) {
		super(name, genre);
		this.level = level;
	}
	
	public String getLevel() {
		return level;
	}
	
	public void setlevel(String level) {
		this.level = level;
	}
	
	public String toString() {
		return super.toString() + "/" +"level : " + level;
	}
	
	
	
	
	
	
	
	
	
	
}
