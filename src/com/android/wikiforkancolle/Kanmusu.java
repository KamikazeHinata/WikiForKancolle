package com.android.wikiforkancolle;

public class Kanmusu {
	
	// Members of Class Kanmusu
	private String name;
	private int ImageID;
	
	// Create function
	public Kanmusu(String name, int ImageID){
		this.name = name;
		this.ImageID = ImageID;
	}
	
	// Other functions
	public String getName(){
		return this.name;
	}
	
	public int getImageID(){
		return this.ImageID;
	}
	
}
