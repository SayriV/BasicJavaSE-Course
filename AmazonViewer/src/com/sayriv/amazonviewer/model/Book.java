package com.sayriv.amazonviewer.model;

import java.util.Date;

public class Book extends Publication implements IVisualizable{
	private int id;
	private String isbn;
	private boolean readed;
	private int timeReaded;
	//int numberPages;
	
	public Book(int id, String title, Date date, String editorial, String authors) {
		super(id, title, date, editorial, authors);
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public boolean isReaded() {
		return readed;
	}

	public void setReaded(boolean readed) {
		this.readed = readed;
	}

	public int getTimeReaded() {
		return timeReaded;
	}

	public void setTimeReaded(int timeReaded) {
		this.timeReaded = timeReaded;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String detailBook =  "\n Title: "+ getTitle() + 
				"\n Editorial : "+ getEditorial() +
				"\n Editorial Date: "+ getEditionDate()+
				"\n Authors: ";
		for (int i = 0; i < getAuthors().length; i++) {
			detailBook += "\t" + getAuthors()[i];
		}
		return detailBook;
	}

	@Override
	public Date startToSee(Date dateI) {
		// TODO Auto-generated method stub
		return dateI;
	}
	
	//Resta la sección de segundos que hay en las dos fechas
	@Override
	public void stopToSee(Date dateI, Date dateF) {
		// TODO Auto-generated method stub
		if (dateF.getSeconds() > dateI.getSeconds()) {
			setTimeReaded(dateF.getSeconds() - dateI.getSeconds());
		}else {
			setTimeReaded(0);
		}
		
	}
	
	//Calcula la diferencia en segundos entre las dos fechas.
	
	/*@Override
	public void stopToSee(Date dateI, Date dateF) {
	  int result = dateF.getTime() > dateI.getTime() ? (int) (dateF.getTime() - dateI.getTime()) / 1000 : 0;
	  this.setTimeRead(result);
	}*/
	
	 
}
