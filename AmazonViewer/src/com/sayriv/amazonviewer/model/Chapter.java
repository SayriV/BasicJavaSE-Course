package com.sayriv.amazonviewer.model;

public class Chapter extends Movie implements IVisualizable{
	
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
	
	@Override
	public int getId() {
		// TODO Auto-generated method stub
		//return super.getId(); -- Devuelve el ID padre, viene de Movie
		return this.id; //Sobreescribo para devorlver el ID del hijo, la variable declarada en este clase
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  "\n Title: "+ getTitle() + 
				"\n Year: "+ getYear() +
				"\n Creator: "+ getCreator() +
				"\n Duration: "+ getDuration();
	}
}