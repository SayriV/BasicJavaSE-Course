package com.sayriv.amazonviewer.model;

import java.util.ArrayList;

public class Serie extends Film{
	
	private int id;
	private int sessionQuantity;
	private ArrayList<Chapter> chapters;
	
	public Serie(String title, String genre, String creator, int duration, int sessionQuantity) {
		super(title, genre, creator, duration);
		// TODO Auto-generated constructor stub
		this.sessionQuantity = sessionQuantity; //Sobreescribiendo método constructor
	
	}

	public int getId() {
		return id;
	}

	public int getSessionQuantity() {
		return sessionQuantity;
	}

	public void setSessionQuantity(int sessionQuantity) {
		this.sessionQuantity = sessionQuantity;
	}

	public ArrayList<Chapter> getChapters() {
		return chapters;
	}

	public void setChapters(ArrayList<Chapter> chapters) {
		this.chapters = chapters;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  "\n Title: "+ getTitle() + 
				"\n Genre: "+ getGenre() +
				"\n Creator: "+ getCreator() +
				"\n Duration: "+ getDuration() + " chapters" +
				"\n Session Quantity: "+ getSessionQuantity();
	}
	
	
	
	
}
