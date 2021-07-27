package com.sayriv.amazonviewer.model;

import java.util.ArrayList;
import java.util.Date;

public class Movie extends Film implements IVisualizable {
	//Datos privados ¿como acceder a ellos? Con get y set
	private int id;
	private int timeViewed;
	
	
	
	
	public Movie(String title, String genre, String creator, int duration, short year) { //Constructor
		super(title, genre, creator, duration);
		setYear(year ); //Sobreescribiendo método constructor
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
		return  "\n Title: "+ getTitle() + 
				"\n Genre: "+ getGenre() +
				"\n Year: "+ getYear() +
				"\n Creator: "+ getCreator() +
				"\n Duration: "+ getDuration();
	}

	// Comienza a implementarse metodos de la Interfaz, ya que ella no tiene implementado ningun metodo por si misma
	// Es obligatorio sobreescribir lo metodos
	// Al implementar una interfaz es necesario añadir comportamientos
	@Override
	public Date startToSee(Date dateI) {
		// TODO Auto-generated method stub
		return dateI;
	}

	@Override
	public void stopToSee(Date dateI, Date dateF) {
		// TODO Auto-generated method stub
		if (dateF.getTime() > dateI.getTime()) {
			setTimeViewed((int)(dateF.getTime() - dateI.getTime()));
		}else {
			setTimeViewed(0);
		}
			
		
	}
	
	public static ArrayList<Movie> makeMoviesList(){
		ArrayList<Movie> movies = new ArrayList();
		for (int i = 1; i <= 5; i++) { //Genere una lista de 5 peliculas
			movies.add(new Movie("Movie " +i, "Genero " +i, "Creador " +i, 120 +i, (short)(2017 +i)));
		}
		return movies;
	}
	
}
