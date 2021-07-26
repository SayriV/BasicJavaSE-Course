package com.sayriv.amazonviewer.model;

public class Movie extends Film{
	//Datos privados ¿como acceder a ellos? Con get y set
	private int id;
	private int timeViewed;
	
	
	
	
	public Movie(String title, String genre, String creator, int duration, short year) { //Constructor
		super(title, genre, creator, duration);
		setYear(year );
	}

	public void showData(){
		/*System.out.println("Title: "+title);
		System.out.println("Genre: "+genre);
		System.out.println("Year: "+year);*/
		
	}

	public int getId() {
		return id;
	}
 
	public int getTimeViewed() {
		return timeViewed;
	}

	public void setTimeViewed(int timeViewed) {
		this.timeViewed = timeViewed;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Title: "+getTitle() + 
				" \n Genre: "+getGenre() +
				"\n Year: "+ getYear()+
				"\n Creator: "+ getCreator() +
				"\n Duration: "+ getDuration();
	}
	
}
