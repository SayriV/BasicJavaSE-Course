package com.sayriv.amazonviewer.model;

import java.util.Date;

public class Magazine extends Publication {

	private int id;

	public Magazine(int id, String title, Date date, String editorial, String authors) {
		super(id, title, date, editorial, authors);
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  "\n Title: "+ getTitle() + 
				"\n Authors: "+ getAuthors() +
				"\n Editorial : "+ getEditorial() +
				"\n Editorial Date: "+ getEditionDate();
	}
}
