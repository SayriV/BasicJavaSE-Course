package com.sayriv.amazonviewer.model;

import java.util.Date;

public class Magazine {
	private int id;
	private String title;
	private String [] authors;
	private Date editionDate;
	private String editorial;
	
	public Magazine(String title, Date editionDate, String editorial) {
		super();
		this.title = title;
		this.editionDate = editionDate;
		this.editorial = editorial;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String[] getAuthors() {
		return authors;
	}

	public void setAuthors(String[] authors) {
		this.authors = authors;
	}

	public Date getEditionDate() {
		return editionDate;
	}

	public void setEditionDate(Date editionDate) {
		this.editionDate = editionDate;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	
	
}
