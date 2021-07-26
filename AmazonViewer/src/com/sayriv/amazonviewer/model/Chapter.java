package com.sayriv.amazonviewer.model;

public class Chapter extends Movie {
	
	private int id;
	
	private int sessionNumber;
	
	
	public Chapter(String title, String genre, String creator, int duration, short year) {
		super(title, genre, creator, duration, year);
		// TODO Auto-generated constructor stub
		this.sessionNumber = sessionNumber;
	}

	public int getSessionNumber() { //Set de un atributo
		return sessionNumber;
	}

	public void setSessionNumber(int sessionNumber) { //Get de un atributo
		this.sessionNumber = sessionNumber;
	}

}