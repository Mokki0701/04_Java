package edu.kh.poly.pack99.model.dto;

public class LoL extends Game{

	public String tier;
	
	public LoL() {}
	
	public LoL(String name, String genre, String tier) {
		super(name, genre);
		this.tier = tier;
	}
	
	public String getTier() {
		return tier;
	}
	
	public void setTier(String tier) {
		this.tier = tier;
	}
	
	public String toString() {
		return super.toString() + "/" +"tier : " + tier;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
